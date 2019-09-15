package com.example.pattern.bridge.demo2;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 * @author xietufei
 * @desc
 * @date 2019/9/15
 */
public class XMLUtilPen {

    //改方法用于从XML配置文件中提取具体类类名，并返回一个实例对象
    public static Object getBean(String args){
        try{
            DocumentBuilderFactory dFactory=DocumentBuilderFactory.newInstance();
            DocumentBuilder builder=dFactory.newDocumentBuilder();
            Document doc;
            doc=builder.parse(new File("D:/idea/DesignPattern/src/main/resources/bridge.xml"));
            NodeList n1=null;
            Node classNode=null;
            String cName=null;
            n1=doc.getElementsByTagName("className");
            if(args.equals("color")){
                //获取包含类名的文本节点
                classNode=n1.item(0).getFirstChild();
            }else if(args.equals("pen")){
                //获取包含类名的文本节点
                classNode=n1.item(1).getFirstChild();
            }
            cName=classNode.getNodeValue();
            //通过类名生产实例对象并将其返回
            Class c=Class.forName(cName);
            Object obj=c.newInstance();
            return obj;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
