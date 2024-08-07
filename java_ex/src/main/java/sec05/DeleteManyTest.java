package sec05;

import app.Database;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.result.DeleteResult;
import org.bson.Document;
import org.bson.conversions.Bson;

import static com.mongodb.client.model.Filters.gt;

public class DeleteManyTest {
    public static void main(String[] args) {
        MongoCollection<Document> collection = Database.getCollection("users");

        int age = 15;
        Bson qeury = gt("age", age);

        DeleteResult result = collection.deleteMany(qeury);
        System.out.println("==> DeleteManyResult : " + result.getDeletedCount());

        Database.close();
    }
}
