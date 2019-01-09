package oz.uds.procedure;

import oz.uds.rs.DefaultResultSet;
import oz.uds.rs.ArrResultSetMeta;
import java.util.Vector;
import java.sql.*;

public class PrcdResultSet extends DefaultResultSet{

    Vector col = new Vector();
    Vector data = new Vector();
    Vector pn = new Vector();
    Vector pt = new Vector();
    int index = 0;

    public PrcdResultSet(Vector c, Vector d, Vector n, Vector t) {
        col.addAll(c);
        data.addAll(d);
        pn.addAll(n);
        pt.addAll(t);
    }

    public boolean next() throws SQLException{
        if (index++ == 0) {
            return true;
        } else {
            return false;
        }
    }

    public String getString(String colName) throws SQLException{
        return (String) data.elementAt(col.indexOf(colName));
    }

    public ResultSetMetaData getMetaData() throws SQLException{
        String[] name = new String[pn.size()];
        String[] type = new String[pn.size()];
        for(int i=0;i<pn.size();i++){
            name[i] = new String((String) pn.elementAt(i));
            type[i] = new String((String) pt.elementAt(i));
            //System.out.println(name[i]+":"+type[i]);
        }

        ArrResultSetMeta uds = new ArrResultSetMeta(name, type);
        return uds;
    }

}
