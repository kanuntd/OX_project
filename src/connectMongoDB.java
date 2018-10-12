import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

public class connectMongoDB {
	MongoClientURI uri ;
	MongoClient client;
	DB db;
	DBCollection collecttion;
	public connectMongoDB() {
		try {
			uri = new MongoClientURI("mongodb://userox:userox123@ds243212.mlab.com:43212/ox");
			client = new MongoClient(uri);
			System.out.println("sec");
		
		} catch (Exception e) {

		}
		
	}
	public void getCollectionName() {
		db = client.getDB(uri.getDatabase());
		
	}
	
	public void input(String user ,String password,String StringPath) {
		    Encode_decode img = new Encode_decode();
		    String imgencode = img.encoder(StringPath); 
	        BasicDBObject insertUser= new BasicDBObject();
	        insertUser.put("user", user);
	        insertUser.put("password", password);
	        insertUser.put("picture",imgencode);
	        collecttion = db.getCollection("User");
	        collecttion.insert(insertUser);
	        System.out.println("OK");

	 }
	public int QueryUser(String user) {
        String check=null;
		BasicDBObject Query = new BasicDBObject();
		Query.put("user", user);
		
		db = client.getDB(uri.getDatabase());
	    collecttion = db.getCollection("User");
        DBCursor cursor = collecttion.find(Query);
        while(cursor.hasNext()) {
              check=cursor.next().toString();
              
        }
        if(check!=null) {
        	return 1;
        }
        return 0;
		
	}
	
	
}

