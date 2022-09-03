package injecao_dependencia;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

/**
 *
 * @author Roni Deringer <ronideringer.ifc@gmail.com>
 */
public class Xml implements FormatType {

    @Override
    public String converte(Aluno object) {
        XStream xml = new XStream(new DomDriver());
       return (xml.toXML(object));
    }
}
