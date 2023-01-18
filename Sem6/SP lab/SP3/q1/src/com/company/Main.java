using System;
using System.Web.Script.Serialization;
        using System.Xml.Serialization;
        using System.IO;

public class PersonInfo
{
    public string FirstName { get; set; }
    public string LastName { get; set; }
    public int Age { get; set; }
}

public interface ISerializerAdapter
{
    string Serialize(object obj);
}

public class JSONSerializerAdapter : ISerializerAdapter
        {
public string Serialize(object obj)
        {
        JavaScriptSerializer jsSerializer = new JavaScriptSerializer();
        return jsSerializer.Serialize(obj);
        }
        }

public class XMLSerializerAdapter : ISerializerAdapter
        {
public string Serialize(object obj)
        {
        XmlSerializer xmlSerializer = new XmlSerializer(obj.GetType());
        using (StringWriter textWriter = new StringWriter())
        {
        xmlSerializer.Serialize(textWriter, obj);
        return textWriter.ToString();
        }
        }
        }

class Program
{
    static void Main()
    {
        PersonInfo person = new PersonInfo
        {
            FirstName = "John",
                    LastName = "Doe",
                    Age = 30
        };

        ISerializerAdapter jsonSerializer = new JSONSerializerAdapter();
        string json = jsonSerializer.Serialize(person);
        Console.WriteLine("JSON: " + json);

        ISerializerAdapter xmlSerializer = new XMLSerializerAdapter();
        string xml = xmlSerializer.Serialize(person);
        Console.WriteLine("XML: " + xml);

        Console.ReadKey();
    }
}
