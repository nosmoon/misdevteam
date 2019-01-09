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


package chosun.ciis.ad.bas.ds;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import somo.framework.util.Util;
import chosun.ciis.ad.bas.rec.AD_BAS_1570_SCURLISTRecord;

/**
 * 
 */


public class AD_BAS_1570_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_BAS_1570_SDataSet(){}
	public AD_BAS_1570_SDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			AD_BAS_1570_SCURLISTRecord rec = new AD_BAS_1570_SCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.seq = rset0.getInt("seq");
			rec.night_shift_dt = Util.checkString(rset0.getString("night_shift_dt"));
			rec.duty_main_empno = Util.checkString(rset0.getString("duty_main_empno"));
			rec.duty_main_empnm = Util.checkString(rset0.getString("duty_main_empnm"));
			rec.duty_sub_empno = Util.checkString(rset0.getString("duty_sub_empno"));
			rec.duty_sub_empnm = Util.checkString(rset0.getString("duty_sub_empnm"));
			rec.make_centr_main_empno = Util.checkString(rset0.getString("make_centr_main_empno"));
			rec.make_centr_main_empnm = Util.checkString(rset0.getString("make_centr_main_empnm"));
			rec.make_centr_sub_empno = Util.checkString(rset0.getString("make_centr_sub_empno"));
			rec.make_centr_sub_empnm = Util.checkString(rset0.getString("make_centr_sub_empnm"));
			rec.dd_nwsp_cont = Util.checkString(rset0.getString("dd_nwsp_cont"));
			rec.incmg_pers = Util.checkString(rset0.getString("incmg_pers"));
			rec.incmg_dt_tm = Util.checkString(rset0.getString("incmg_dt_tm"));
			rec.chg_pers = Util.checkString(rset0.getString("chg_pers"));
			rec.chg_dt_tm = Util.checkString(rset0.getString("chg_dt_tm"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	AD_BAS_1570_SDataSet ds = (AD_BAS_1570_SDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_BAS_1570_SCURLISTRecord curlistRec = (AD_BAS_1570_SCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.cmpy_cd%>
<%= curlistRec.seq%>
<%= curlistRec.night_shift_dt%>
<%= curlistRec.duty_main_empno%>
<%= curlistRec.duty_main_empnm%>
<%= curlistRec.duty_sub_empno%>
<%= curlistRec.duty_sub_empnm%>
<%= curlistRec.make_centr_main_empno%>
<%= curlistRec.make_centr_main_empnm%>
<%= curlistRec.make_centr_sub_empno%>
<%= curlistRec.make_centr_sub_empnm%>
<%= curlistRec.dd_nwsp_cont%>
<%= curlistRec.incmg_pers%>
<%= curlistRec.incmg_dt_tm%>
<%= curlistRec.chg_pers%>
<%= curlistRec.chg_dt_tm%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Apr 27 14:52:27 KST 2009 */