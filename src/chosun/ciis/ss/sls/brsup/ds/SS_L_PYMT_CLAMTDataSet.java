/***************************************************************************************************
* ���ϸ� : SS_L_PYMT_CLAMTDataSet.java
* ��� : ������������-Billing�ڵ���ü-�����ڰ���-���ݳ�����ȸ
* �ۼ����� : 2004-04-12
* �ۼ��� : ���
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
 * ������������-Billing�ڵ���ü-�����ڰ���-���ݳ�����ȸ
 *
 */


public class SS_L_PYMT_CLAMTDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
    public ArrayList rsltcur = new ArrayList();
    public String errcode;
    public String errmsg;
    public long totalcnt;

    public SS_L_PYMT_CLAMTDataSet(){}
    public SS_L_PYMT_CLAMTDataSet(String errcode, String errmsg, long totalcnt){
        this.errcode = errcode;
        this.errmsg = errmsg;
        this.totalcnt = totalcnt;
    }

    public void setErrcode(String errcode){
        this.errcode = errcode;
    }

    public void setErrmsg(String errmsg){
        this.errmsg = errmsg;
    }

    public void setTotalcnt(long totalcnt){
        this.totalcnt = totalcnt;
    }

    public String getErrcode(){
        return this.errcode;
    }

    public String getErrmsg(){
        return this.errmsg;
    }

    public long getTotalcnt(){
        return this.totalcnt;
    }

    public void getValues(CallableStatement cstmt) throws SQLException{
        this.errcode = Util.checkString(cstmt.getString(1));
        this.errmsg = Util.checkString(cstmt.getString(2));
        if(!"".equals(this.errcode)){			return;		}
        this.totalcnt = cstmt.getLong(7);
        ResultSet rset0 = (ResultSet) cstmt.getObject(8);
        while(rset0.next()){
            SS_L_PYMT_CLAMTRSLTCURRecord rec = new SS_L_PYMT_CLAMTRSLTCURRecord();
            rec.rdr_no = Util.checkString(rset0.getString("rdr_no"));
            rec.medicd = Util.checkString(rset0.getString("medicd"));
            rec.subsmappli = Util.checkString(rset0.getString("subsmappli"));
            rec.clamtmthdnm = Util.checkString(rset0.getString("clamtmthdnm"));
            rec.rcpmclsfnm = Util.checkString(rset0.getString("rcpmclsfnm"));
            rec.recpdt = Util.checkString(rset0.getString("recpdt"));
            rec.shftdt = Util.checkString(rset0.getString("shftdt"));
            rec.clamt = rset0.getInt("clamt");
            rec.dlvqty = rset0.getInt("dlvqty");
            rec.realsubsamt = rset0.getInt("realsubsamt");
            this.rsltcur.add(rec);
        }
    }

    public String rsltcurOptHtml(String selected){
        StringBuffer sb = new StringBuffer("");
        int size = rsltcur.size();
        for(int i=0; i<size; i++){
            SS_L_PYMT_CLAMTRSLTCURRecord rec = (SS_L_PYMT_CLAMTRSLTCURRecord)rsltcur.get(i);


            String code = rec.rdr_no;
            String name = rec.medicd;

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
            SS_L_PYMT_CLAMTRSLTCURRecord rec = (SS_L_PYMT_CLAMTRSLTCURRecord)rsltcur.get(i);


            String code = rec.rdr_no;
            String name = rec.medicd;

            sb.append("<input name=\"");
            sb.append("rdr_no");
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
            SS_L_PYMT_CLAMTRSLTCURRecord rec = (SS_L_PYMT_CLAMTRSLTCURRecord)rsltcur.get(i);


            String code = rec.rdr_no;
            String name = rec.medicd;

            sb.append("<input name=\"");
            sb.append("rdr_no");
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
    SS_L_PYMT_CLAMTDataSet ds = (SS_L_PYMT_CLAMTDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
    for(int i=0; i<ds.rsltcur.size(); i++){
        SS_L_PYMT_CLAMTRSLTCURRecord rsltcurRec = (SS_L_PYMT_CLAMTRSLTCURRecord)ds.rsltcur.get(i);%>
HTML �ڵ��....
    <%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTotalcnt()%>
<%= ds.getRsltcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= rsltcurRec.rdr_no%>
<%= rsltcurRec.medicd%>
<%= rsltcurRec.subsmappli%>
<%= rsltcurRec.clamtmthdnm%>
<%= rsltcurRec.rcpmclsfnm%>
<%= rsltcurRec.recpdt%>
<%= rsltcurRec.clamt%>
<%= rsltcurRec.dlvqty%>
<%= rsltcurRec.realsubsamt%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Apr 12 10:43:35 KST 2004 */