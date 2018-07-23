import java.net.UnknownHostException;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

public class CRUD {

	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub

MongoClient mongoClient = new MongoClient("localhost", 27017);

/**** Get database ****/
// if database doesn't exists, MongoDB will create it for you
DB db = mongoClient.getDB("testdb");

System.out.println(mongoClient.getDatabaseNames());
/**** Get collection / table from 'testdb' ****/
// if collection doesn't exists, MongoDB will create it for you
DBCollection collection = db.getCollection("users");
/**** Insert ****/
// create a document to store key and value


BasicDBObject document = new BasicDBObject();
document.put("firstName", "Dharam");
document.put("lastName", "Rajput");
System.out.println(document.get("lastName"));
collection.insert(document);

BasicDBObject UpdDocument = new BasicDBObject();
UpdDocument.put("firstName", "Dharamendra");

collection.update(document, UpdDocument);
System.out.println(UpdDocument.get("firstName"));

	

	}

}
