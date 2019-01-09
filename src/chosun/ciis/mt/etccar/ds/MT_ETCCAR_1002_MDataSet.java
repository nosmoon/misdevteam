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


package chosun.ciis.mt.etccar.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.etccar.dm.*;
import chosun.ciis.mt.etccar.rec.*;

/**
 * 
 */


public class MT_ETCCAR_1002_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_ETCCAR_1002_MDataSet(){}
	public MT_ETCCAR_1002_MDataSet(String errcode, String errmsg){
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
			MT_ETCCAR_1002_MCURLIST1Record rec = new MT_ETCCAR_1002_MCURLIST1Record();
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.buy_lent_clsf = Util.checkString(rset0.getString("buy_lent_clsf"));
			rec.car_no = Util.checkString(rset0.getString("car_no"));
			rec.car_modl = Util.checkString(rset0.getString("car_modl"));
			rec.oil_kind = Util.checkString(rset0.getString("oil_kind"));
			rec.cmpy_mang_nm = Util.checkString(rset0.getString("cmpy_mang_nm"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(9);
		while(rset1.next()){
			MT_ETCCAR_1002_MCURLIST2Record rec = new MT_ETCCAR_1002_MCURLIST2Record();
			rec.car_no = Util.checkString(rset1.getString("car_no"));
			rec.car_modl = Util.checkString(rset1.getString("car_modl"));
			rec.use_usag = Util.checkString(rset1.getString("use_usag"));
			rec.cmpy_mang_nm = Util.checkString(rset1.getString("cmpy_mang_nm"));
			rec.buy_lent_clsf = Util.checkString(rset1.getString("buy_lent_clsf"));
			rec.seq = Util.checkString(rset1.getString("seq"));
			rec.occr_dt = Util.checkString(rset1.getString("occr_dt"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	MT_ETCCAR_1002_MDataSet ds = (MT_ETCCAR_1002_MDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		MT_ETCCAR_1002_MCURLIST1Record curlist1Rec = (MT_ETCCAR_1002_MCURLIST1Record)ds.curlist1.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		MT_ETCCAR_1002_MCURLIST2Record curlist2Rec = (MT_ETCCAR_1002_MCURLIST2Record)ds.curlist2.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
<%= ds.getCurlist2()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlist1Rec.occr_dt%>
<%= curlist1Rec.seq%>
<%= curlist1Rec.buy_lent_clsf%>
<%= curlist1Rec.car_no%>
<%= curlist1Rec.car_modl%>
<%= curlist1Rec.oil_kind%>
<%= curlist1Rec.cmpy_mang_nm%>
<%= curlist2Rec.car_no%>
<%= curlist2Rec.car_modl%>
<%= curlist2Rec.use_usag%>
<%= curlist2Rec.cmpy_mang_nm%>
<%= curlist2Rec.buy_lent_clsf%>
<%= curlist2Rec.seq%>
<%= curlist2Rec.occr_dt%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Aug 12 19:30:49 KST 2009 */