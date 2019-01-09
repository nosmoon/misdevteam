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


public class MT_COMMATR_1610_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_COMMATR_1610_LDataSet(){}
	public MT_COMMATR_1610_LDataSet(String errcode, String errmsg){
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
			MT_COMMATR_1610_LCURLISTRecord rec = new MT_COMMATR_1610_LCURLISTRecord();
			rec.part_cd = Util.checkString(rset0.getString("part_cd"));
			rec.part_nm = Util.checkString(rset0.getString("part_nm"));
			rec.part_dtl_nm = Util.checkString(rset0.getString("part_dtl_nm"));
			rec.barcode = Util.checkString(rset0.getString("barcode"));
			rec.maker = Util.checkString(rset0.getString("maker"));
			rec.std_modl = Util.checkString(rset0.getString("std_modl"));
			rec.prt_seq = Util.checkString(rset0.getString("prt_seq"));
			rec.usag = Util.checkString(rset0.getString("usag"));
			rec.purc_info = Util.checkString(rset0.getString("purc_info"));
			rec.use_yn = Util.checkString(rset0.getString("use_yn"));
			rec.chg_pers = Util.checkString(rset0.getString("chg_pers"));
			rec.chg_dt_tm = Util.checkString(rset0.getString("chg_dt_tm"));
			rec.purc_uprc = Util.checkString(rset0.getString("purc_uprc"));
			rec.stok_10 = Util.checkString(rset0.getString("stok_10"));
			rec.stok_22 = Util.checkString(rset0.getString("stok_22"));
			rec.stok_25 = Util.checkString(rset0.getString("stok_25"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	MT_COMMATR_1610_LDataSet ds = (MT_COMMATR_1610_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_COMMATR_1610_LCURLISTRecord curlistRec = (MT_COMMATR_1610_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.part_cd%>
<%= curlistRec.part_nm%>
<%= curlistRec.part_dtl_nm%>
<%= curlistRec.maker%>
<%= curlistRec.std_modl%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Feb 04 15:16:03 KST 2015 */