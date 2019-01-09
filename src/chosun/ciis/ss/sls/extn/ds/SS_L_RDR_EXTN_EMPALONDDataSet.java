/***************************************************************************************************
* ���ϸ� : SS_L_RDR_EXTN_EMPALONDDataSet.java
* ��� : ���Ȯ�� ���� �󼼸���� ���� DataSet
* �ۼ����� : 2003-12-15
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * class definition
 *
 */


public class SS_L_RDR_EXTN_EMPALONDDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_RDR_EXTN_EMPALONDDataSet(){}
	public SS_L_RDR_EXTN_EMPALONDDataSet(String errcode, String errmsg){
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
		ResultSet rset1 = (ResultSet) cstmt.getObject(5);
		while(rset1.next()){
			SS_L_RDR_EXTN_EMPALONDCURCOMMLISTRecord rec = new SS_L_RDR_EXTN_EMPALONDCURCOMMLISTRecord();
			rec.medicdnm = Util.checkString(rset1.getString("medicdnm"));
			rec.rdr_extnqty = rset1.getInt("rdr_extnqty");
			rec.calcqty = rset1.getInt("calcqty");
			rec.basialonamt = rset1.getInt("basialonamt");
			rec.alonamt = rset1.getInt("alonamt");
			this.curcommlist.add(rec);
		}
	}

}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SS_L_RDR_EXTN_EMPALONDDataSet ds = (SS_L_RDR_EXTN_EMPALONDDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_RDR_EXTN_EMPALONDCURCOMMLISTRecord curcommlistRec = (SS_L_RDR_EXTN_EMPALONDCURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurcommlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curcommlistRec.medicdnm%>
<%= curcommlistRec.rdr_extnqty%>
<%= curcommlistRec.calcqty%>
<%= curcommlistRec.basialonamt%>
<%= curcommlistRec.alonamt%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Dec 16 11:53:45 KST 2003 */