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


public class MT_COMMATR_7110_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_COMMATR_7110_LDataSet(){}
	public MT_COMMATR_7110_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(11);
		while(rset0.next()){
			MT_COMMATR_7110_LCURLISTRecord rec = new MT_COMMATR_7110_LCURLISTRecord();
			rec.ewh_dt = Util.checkString(rset0.getString("ewh_dt"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.matr_clas_nm = Util.checkString(rset0.getString("matr_clas_nm"));
			rec.matr_nm = Util.checkString(rset0.getString("matr_nm"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.ewh_qunt = Util.checkString(rset0.getString("ewh_qunt"));
			rec.unit = Util.checkString(rset0.getString("unit"));
			rec.ewh_uprc = Util.checkString(rset0.getString("ewh_uprc"));
			rec.ewh_amt = Util.checkString(rset0.getString("ewh_amt"));
			rec.rest_amt = Util.checkString(rset0.getString("rest_amt"));
			rec.stok = Util.checkString(rset0.getString("stok"));
			rec.safe_stok = Util.checkString(rset0.getString("safe_stok"));
			rec.fac_clsf = Util.checkString(rset0.getString("fac_clsf"));
			rec.incmg_pers = Util.checkString(rset0.getString("incmg_pers"));
			
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	MT_COMMATR_7110_LDataSet ds = (MT_COMMATR_7110_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_COMMATR_7110_LCURLISTRecord curlistRec = (MT_COMMATR_7110_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.dlco_nm%>
<%= curlistRec.matr_nm%>
<%= curlistRec.ewh_qunt%>
<%= curlistRec.ewh_uprc%>
<%= curlistRec.ewh_amt%>
<%= curlistRec.rest_amt%>
<%= curlistRec.stok%>
<%= curlistRec.safe_stok%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Dec 26 15:23:27 KST 2012 */