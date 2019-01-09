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


public class SE_QTY_2320_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String issu_dt;
	public String send_clos_grp_clsf;
	public String clos_yn;
	public String setl_stat_nm;
	public String clos_dt;
	public String clos_tms;
	public long ser_no1;
	public long ser_no2;
	public String sect_remk;
	public String remk;
	public String chg_matt;

	public SE_QTY_2320_LDataSet(){}
	public SE_QTY_2320_LDataSet(String errcode, String errmsg, String issu_dt, String send_clos_grp_clsf, String clos_yn, String setl_stat_nm, String clos_dt, String clos_tms, long ser_no1, long ser_no2, String sect_remk, String remk, String chg_matt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.issu_dt = issu_dt;
		this.send_clos_grp_clsf = send_clos_grp_clsf;
		this.clos_yn = clos_yn;
		this.setl_stat_nm = setl_stat_nm;
		this.clos_dt = clos_dt;
		this.clos_tms = clos_tms;
		this.ser_no1 = ser_no1;
		this.ser_no2 = ser_no2;
		this.sect_remk = sect_remk;
		this.remk = remk;
		this.chg_matt = chg_matt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public void setSend_clos_grp_clsf(String send_clos_grp_clsf){
		this.send_clos_grp_clsf = send_clos_grp_clsf;
	}

	public void setClos_yn(String clos_yn){
		this.clos_yn = clos_yn;
	}

	public void setSetl_stat_nm(String setl_stat_nm){
		this.setl_stat_nm = setl_stat_nm;
	}

	public void setClos_dt(String clos_dt){
		this.clos_dt = clos_dt;
	}

	public void setClos_tms(String clos_tms){
		this.clos_tms = clos_tms;
	}

	public void setSer_no1(long ser_no1){
		this.ser_no1 = ser_no1;
	}

	public void setSer_no2(long ser_no2){
		this.ser_no2 = ser_no2;
	}

	public void setSect_remk(String sect_remk){
		this.sect_remk = sect_remk;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setChg_matt(String chg_matt){
		this.chg_matt = chg_matt;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getIssu_dt(){
		return this.issu_dt;
	}

	public String getSend_clos_grp_clsf(){
		return this.send_clos_grp_clsf;
	}

	public String getClos_yn(){
		return this.clos_yn;
	}

	public String getSetl_stat_nm(){
		return this.setl_stat_nm;
	}

	public String getClos_dt(){
		return this.clos_dt;
	}

	public String getClos_tms(){
		return this.clos_tms;
	}

	public long getSer_no1(){
		return this.ser_no1;
	}

	public long getSer_no2(){
		return this.ser_no2;
	}

	public String getSect_remk(){
		return this.sect_remk;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getChg_matt(){
		return this.chg_matt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.issu_dt = Util.checkString(cstmt.getString(7));
		this.send_clos_grp_clsf = Util.checkString(cstmt.getString(8));
		this.clos_yn = Util.checkString(cstmt.getString(9));
		this.setl_stat_nm = Util.checkString(cstmt.getString(10));
		this.clos_dt = Util.checkString(cstmt.getString(11));
		this.clos_tms = Util.checkString(cstmt.getString(12));
		this.ser_no1 = cstmt.getLong(13);
		this.ser_no2 = cstmt.getLong(14);
		this.sect_remk = Util.checkString(cstmt.getString(15));
		this.remk = Util.checkString(cstmt.getString(16));
		this.chg_matt = Util.checkString(cstmt.getString(17));
		ResultSet rset0 = (ResultSet) cstmt.getObject(18);
		while(rset0.next()){
			SE_QTY_2320_LCURLISTRecord rec = new SE_QTY_2320_LCURLISTRecord();
			rec.medi_nm = Util.checkString(rset0.getString("medi_nm"));
			rec.sect_nm = Util.checkString(rset0.getString("sect_nm"));
			rec.pcnt = Util.checkString(rset0.getString("pcnt"));
			rec.rptv_route_prt_plac_nm = Util.checkString(rset0.getString("rptv_route_prt_plac_nm"));
			rec.prt_plac_nm = Util.checkString(rset0.getString("prt_plac_nm"));
			rec.ecnt_nm = Util.checkString(rset0.getString("ecnt_nm"));
			rec.ledt_nm = Util.checkString(rset0.getString("ledt_nm"));
			rec.gnr_qty = rset0.getInt("gnr_qty");
			rec.spsl_qty = rset0.getInt("spsl_qty");
			rec.tot_qty = rset0.getInt("tot_qty");
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SE_QTY_2320_LDataSet ds = (SE_QTY_2320_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_QTY_2320_LCURLISTRecord curlistRec = (SE_QTY_2320_LCURLISTRecord)ds.curlist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getIssu_dt()%>
<%= ds.getSend_clos_grp_clsf()%>
<%= ds.getClos_yn()%>
<%= ds.getSetl_stat_nm()%>
<%= ds.getClos_dt()%>
<%= ds.getClos_tms()%>
<%= ds.getSer_no1()%>
<%= ds.getSer_no2()%>
<%= ds.getSect_remk()%>
<%= ds.getRemk()%>
<%= ds.getChg_matt()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlistRec.medi_nm%>
<%= curlistRec.sect_nm%>
<%= curlistRec.pcnt%>
<%= curlistRec.rptv_route_prt_plac_nm%>
<%= curlistRec.prt_plac_nm%>
<%= curlistRec.ecnt_nm%>
<%= curlistRec.ledt_nm%>
<%= curlistRec.gnr_qty%>
<%= curlistRec.spsl_qty%>
<%= curlistRec.tot_qty%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Jun 09 15:55:35 KST 2009 */