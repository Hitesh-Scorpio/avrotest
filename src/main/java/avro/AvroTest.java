package avro;

import java.io.File;

import org.apache.avro.Schema;

/**
 * Created by hitesh on 5/9/17.
 */
public class AvroTest
{
  public void test() throws Exception
  {
    Schema schema = new Schema.Parser().parse(getClass().getResourceAsStream("//home//hitesh//latestrepos//avrotest//src//main//avro//person.avsc"));
    System.out.print(schema.toString());

  }

  public static void main(String[] args) throws Exception
  {
    Schema.Parser parser = new Schema.Parser(); // Make this static and reuse
    //AvroTest av = new AvroTest();
   // av.test();
    String s = "[\n" +
      "{\n" +
      "    \"type\": \"record\",\n" +
      "    \"namespace\": \"avro\",\n" +
      "    \"name\": \"AddressRecord\",\n" +
      "    \"fields\": [\n" +
      "        {\n" +
      "            \"name\": \"streetaddress\",\n" +
      "            \"type\": \"string\"\n" +
      "        },\n" +
      "        {\n" +
      "            \"name\": \"city\",\n" +
      "            \"type\": \"string\"\n" +
      "        },\n" +
      "        {\n" +
      "            \"name\": \"state\",\n" +
      "            \"type\": \"string\"\n" +
      "        },\n" +
      "        {\n" +
      "            \"name\": \"zip\",\n" +
      "            \"type\": \"string\"\n" +
      "        }\n" +
      "    ]\n" +
      "}\n" +
      "]\n";
    Schema addressSchema =parser.parse(s);
    org.apache.avro.compiler.specific.SpecificCompiler compiler = new org.apache.avro.compiler.specific.SpecificCompiler(addressSchema);
    System.out.println(addressSchema.toString());
    File src = new File("//home//hitesh//latestrepos//avrotest//src//main//avro//person.avsc");
    compiler.compileToDestination(src, new File("avro"));
  }

}
