/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���ڿ��-������û
* �ۼ����� : 2007-05-22
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.mt.commatr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.commatr.dm.*;
import chosun.ciis.mt.commatr.rec.*;

/**
 * 
 */


public class MT_COMMATR_8101_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_COMMATR_8101_LDataSet(){}
	public MT_COMMATR_8101_LDataSet(String errcode, String errmsg){
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
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			MT_COMMATR_8101_LCURLISTRecord rec = new MT_COMMATR_8101_LCURLISTRecord();
			rec.fac_clsf = Util.checkString(rset0.getString("fac_clsf"));
			rec.factcdnm = Util.checkString(rset0.getString("factcdnm"));
			rec.pj_kind = Util.checkString(rset0.getString("pj_kind"));
			rec.pj_kind_nm = Util.checkString(rset0.getString("pj_kind_nm"));
			rec.qunt = Util.checkString(rset0.getString("qunt"));
			rec.uprc = Util.checkString(rset0.getString("uprc"));
			rec.amt = Util.checkString(rset0.getString("amt"));
			rec.tot_amt = Util.checkString(rset0.getString("tot_amt"));			
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	MT_COMMATR_8101_LDataSet ds = (MT_COMMATR_8101_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_COMMATR_8101_LCURLISTRecord curlistRec = (MT_COMMATR_8101_LCURLISTRecord)ds.curlist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlistRec.fac_clsf%>
<%= curlistRec.factcdnm%>
<%= curlistRec.pj_kind%>
<%= curlistRec.pj_kind_nm%>
<%= curlistRec.qunt%>
<%= curlistRec.uprc%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue May 14 17:30:53 KST 2013 */