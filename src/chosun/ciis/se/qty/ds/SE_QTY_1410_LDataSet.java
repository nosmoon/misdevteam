/***************************************************************************************************
* ���ϸ� : .java
* ��� : �ǸŽý���
* �ۼ����� : 2009-02-18
* �ۼ��� : ��â��
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.se.qty.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.qty.dm.*;
import chosun.ciis.se.qty.rec.*;

/**
 * 
 */


public class SE_QTY_1410_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_QTY_1410_LDataSet(){}
	public SE_QTY_1410_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(9);
		while(rset0.next()){
			SE_QTY_1410_LCURLISTRecord rec = new SE_QTY_1410_LCURLISTRecord();
			rec.yymm = Util.checkString(rset0.getString("yymm"));
			rec.tms = Util.checkString(rset0.getString("tms"));
			rec.curmm_val_qty = rset0.getInt("curmm_val_qty");
			rec.curmm_no_val_qty = rset0.getInt("curmm_no_val_qty");
			rec.curmm_issu_qty = rset0.getInt("curmm_issu_qty");
			rec.gnr_enty_qty = rset0.getInt("gnr_enty_qty");
			rec.isenty_qty = rset0.getInt("isenty_qty");
			rec.isicdc_qty = rset0.getInt("isicdc_qty");
			rec.rdr_extn_enty_qty = rset0.getInt("rdr_extn_enty_qty");
			rec.val_movm_qty = rset0.getInt("val_movm_qty");
			rec.val_icdc_qty = rset0.getInt("val_icdc_qty");
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SE_QTY_1410_LDataSet ds = (SE_QTY_1410_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_QTY_1410_LCURLISTRecord curlistRec = (SE_QTY_1410_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.yymm%>
<%= curlistRec.tms%>
<%= curlistRec.curmm_val_qty%>
<%= curlistRec.curmm_no_val_qty%>
<%= curlistRec.curmm_issu_qty%>
<%= curlistRec.gnr_enty_qty%>
<%= curlistRec.isenty_qty%>
<%= curlistRec.isicdc_qty%>
<%= curlistRec.rdr_extn_enty_qty%>
<%= curlistRec.val_movm_qty%>
<%= curlistRec.val_icdc_qty%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Feb 19 19:55:06 KST 2009 */