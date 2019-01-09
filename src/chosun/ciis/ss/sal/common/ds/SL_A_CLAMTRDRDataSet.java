/***************************************************************************************************
* ���ϸ� : SL_A_CLAMTRDRDataSet.java
* ��� : ����-�Աݳ�����������
* �ۼ����� : 2004-08-10
* �ۼ��� : �迵��
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/


package chosun.ciis.ss.sal.common.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sal.common.dm.*;
import chosun.ciis.ss.sal.common.rec.*;

/**
 * ����-�Աݳ�����������
 *
 */

public class SL_A_CLAMTRDRDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
    public ArrayList rsltcur = new ArrayList();
    public String errcode;
    public String errmsg;

    public SL_A_CLAMTRDRDataSet(){}
    public SL_A_CLAMTRDRDataSet(String errcode, String errmsg){
        this.errcode = errcode;
        this.errmsg = errmsg;
    }

    public void setErrcode(String errcode){
        this.errcode = errcode;
    }

    public void setErrmsg(String errmsg){
        this.errmsg = errmsg;
    }

    public String getErrcode(){
        return this.errcode;
    }

    public String getErrmsg(){
        return this.errmsg;
    }

    public void getValues(CallableStatement cstmt) throws SQLException{
        this.errcode = Util.checkString(cstmt.getString(1));
        this.errmsg = Util.checkString(cstmt.getString(2));
        if(!"".equals(this.errcode)){			return;		}
        ResultSet rset0 = (ResultSet) cstmt.getObject(13);
        while(rset0.next()){
            SL_A_CLAMTRDRRSLTCURRecord rec = new SL_A_CLAMTRDRRSLTCURRecord();
            rec.rdrno = Util.checkString(rset0.getString("rdrno"));
            rec.dlvdstccd = Util.checkString(rset0.getString("dlvdstccd"));
            rec.dlvno = Util.checkString(rset0.getString("dlvno"));
            rec.rdr_nm = Util.checkString(rset0.getString("rdr_nm"));
            rec.medicd = Util.checkString(rset0.getString("medicd"));
            rec.medinm = Util.checkString(rset0.getString("medinm"));
            rec.dlvqty = rset0.getInt("dlvqty");
            rec.realsubsamt = rset0.getInt("realsubsamt");
            rec.subsmappli = Util.checkString(rset0.getString("subsmappli"));
            rec.rcpmclsfcd = Util.checkString(rset0.getString("rcpmclsfcd"));
            rec.rcpmclsfnm = Util.checkString(rset0.getString("rcpmclsfnm"));
            rec.clamtmthdcd = Util.checkString(rset0.getString("clamtmthdcd"));
            rec.clamtmthdnm = Util.checkString(rset0.getString("clamtmthdnm"));
            rec.clamamt = rset0.getInt("clamamt");
            rec.clamt = rset0.getInt("clamt");
            this.rsltcur.add(rec);
        }
    }

    public String rsltcurOptHtml(String selected){
        StringBuffer sb = new StringBuffer("");
        int size = rsltcur.size();
        for(int i=0; i<size; i++){
            SL_A_CLAMTRDRRSLTCURRecord rec = (SL_A_CLAMTRDRRSLTCURRecord)rsltcur.get(i);


            String code = rec.rdrno;
            String name = rec.dlvdstccd;

            sb.append("<option value=\"");
            sb.append(code);
            sb.append("\"");
            if(code.equals(selected)){
                sb.append(" selected ");
            }
            sb.append(">");
            sb.append(name);
            sb.append("</option>");
        }
        return sb.toString();
    }

    public String rsltcurChkHtml(String selected){
        StringBuffer sb = new StringBuffer("");
        int size = rsltcur.size();
        for(int i=0; i<size; i++){
            SL_A_CLAMTRDRRSLTCURRecord rec = (SL_A_CLAMTRDRRSLTCURRecord)rsltcur.get(i);


            String code = rec.rdrno;
            String name = rec.dlvdstccd;

            sb.append("<input name=\"");
            sb.append("rdrno");
            sb.append("\" type=\"checkbox\" value=\"");
            sb.append(code);
            sb.append("\"");
            if(code.equals(selected)){
                sb.append(" checked ");
            }
            sb.append(">");
            sb.append(name);
            sb.append("</input>");
        }
        return sb.toString();
    }

    public String rsltcurRdoHtml(String selected){
        StringBuffer sb = new StringBuffer("");
        int size = rsltcur.size();
        for(int i=0; i<size; i++){
            SL_A_CLAMTRDRRSLTCURRecord rec = (SL_A_CLAMTRDRRSLTCURRecord)rsltcur.get(i);


            String code = rec.rdrno;
            String name = rec.dlvdstccd;

            sb.append("<input name=\"");
            sb.append("rdrno");
            sb.append("\" type=\"radio\" value=\"");
            sb.append(code);
            sb.append("\"");
            if(code.equals(selected)){
                sb.append(" checked ");
            }
            sb.append(">");
            sb.append(name);
            sb.append("</input>");
        }
        return sb.toString();
    }
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
    SL_A_CLAMTRDRDataSet ds = (SL_A_CLAMTRDRDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
    for(int i=0; i<ds.rsltcur.size(); i++){
        SL_A_CLAMTRDRRSLTCURRecord rsltcurRec = (SL_A_CLAMTRDRRSLTCURRecord)ds.rsltcur.get(i);%>
HTML �ڵ��....
    <%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getRsltcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= rsltcurRec.rdrno%>
<%= rsltcurRec.dlvdstccd%>
<%= rsltcurRec.dlvno%>
<%= rsltcurRec.rdr_nm%>
<%= rsltcurRec.medicd%>
<%= rsltcurRec.medinm%>
<%= rsltcurRec.dlvqty%>
<%= rsltcurRec.realsubsamt%>
<%= rsltcurRec.subsmappli%>
<%= rsltcurRec.rcpmclsfcd%>
<%= rsltcurRec.rcpmclsfnm%>
<%= rsltcurRec.clamtmthdcd%>
<%= rsltcurRec.clamtmthdnm%>
<%= rsltcurRec.clamamt%>
<%= rsltcurRec.clamt%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Aug 11 01:38:44 KST 2004 */