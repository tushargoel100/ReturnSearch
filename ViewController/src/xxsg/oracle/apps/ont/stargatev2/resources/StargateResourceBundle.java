
package xxsg.oracle.apps.ont.stargatev2.resources;

import java.io.IOException;

import java.util.ListResourceBundle;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import org.xml.sax.SAXException;

public class StargateResourceBundle extends ListResourceBundle {
    public StargateResourceBundle() {
        super();
    }


    private static Object[][] contents;

    @Override
    public Object[][] getContents() {
        System.out.println(" get locale code " + getLocaleCode() + " locale " + getLocale());
        File file;
        try {

            if (getLocaleCode().compareTo("it") == 0) {
                file = new File("//WEBLOGIC//Resource_it.xml");
            } else if (getLocaleCode().compareTo("fr") == 0) { // D:\\MediaMarket\\Resource_fr.xml");
                file = new File("//WEBLOGIC//Resource_fr.xml");
            } else if (getLocaleCode().compareTo("en") == 0) {
                file = new File("//WEBLOGIC//Resource_en.xml");
            } else {
                file = new File("//WEBLOGIC//Resource.xml");
                //   file = new File("//WEBLOGIC//Resource.xml");
            }

            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(file);
            doc.getDocumentElement().normalize();
            NodeList nList = doc.getElementsByTagName("label");
            contents = new Object[nList.getLength()][2];
            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    contents[temp][0] = getTagValue("key", eElement);
                    contents[temp][1] = getTagValue("value", eElement);

                    //System.out.println("1 value is " +temp+""+contents[temp][0]);
                    //System.out.println("2 value is " + contents[temp][1]);
                }
            }
        } catch (Exception e) {

            if (getLocaleCode().compareTo("it") == 0) {
                file = new File("D://MediaMarket//Resource_it.xml");
            } else if (getLocaleCode().compareTo("fr") == 0) { // D:\\MediaMarket\\Resource_fr.xml");
                file = new File("D://MediaMarket//Resource_fr.xml");
            } else if (getLocaleCode().compareTo("en") == 0) {
                file = new File("D://MediaMarket//Resource_en.xml");
            } else {
                file = new File("D://MediaMarket//Resource.xml");
                //   file = new File("//WEBLOGIC//Resource.xml");
            }
            try {
                DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
                DocumentBuilder db = dbf.newDocumentBuilder();
                Document doc = db.parse(file);
                doc.getDocumentElement().normalize();
                NodeList nList = doc.getElementsByTagName("label");
                contents = new Object[nList.getLength()][2];
                for (int temp = 0; temp < nList.getLength(); temp++) {
                    Node nNode = nList.item(temp);
                    if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                        Element eElement = (Element) nNode;
                        contents[temp][0] = getTagValue("key", eElement);
                        contents[temp][1] = getTagValue("value", eElement);

                        //System.out.println("1 value is " +temp+""+contents[temp][0]);
                        //System.out.println("2 value is " + contents[temp][1]);
                    }
                }
            } catch (SAXException saxe) {
                // TODO: Add catch code
                saxe.printStackTrace();
            } catch (IOException ioe) {
                // TODO: Add catch code
                ioe.printStackTrace();
            } catch (ParserConfigurationException pce) {
                // TODO: Add catch code
                pce.printStackTrace();
            }
            e.printStackTrace();
        }
        return contents;
    }

    private static String getTagValue(String sTag, Element eElement) {
        NodeList nlList = eElement.getElementsByTagName(sTag).item(0).getChildNodes();
        Node nValue = (Node) nlList.item(0);
        return nValue.getNodeValue();
    }

    public String getLocaleCode() {
        return "en";
    }
}
