/***************************************************************************************************
* 파일명 : 
* 기능 : 
* 작성일자 : 
* 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.pl.com.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pl.com.dm.*;
import chosun.ciis.pl.com.rec.*;

/**
 * 
 */


public class PL_COM_1420_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String dlco_cd;
	public String dlco_seq;
	public String dlco_nm;
	public String send_plac_seq;
	public String send_plac_nm;
	public String dlco_clsf;
	public String area;
	public String prv_curr_clsf;
	public String rsltcnt;

	public PL_COM_1420_SDataSet(){}
	public PL_COM_1420_SDataSet(String errcode, String errmsg, String dlco_cd, String dlco_seq, String dlco_nm, String send_plac_seq, String send_plac_nm, String dlco_clsf, String area, String prv_curr_clsf, String rsltcnt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.dlco_cd = dlco_cd;
		this.dlco_seq = dlco_seq;
		this.dlco_nm = dlco_nm;
		this.send_plac_seq = send_plac_seq;
		this.send_plac_nm = send_plac_nm;
		this.dlco_clsf = dlco_clsf;
		this.area = area;
		this.prv_curr_clsf = prv_curr_clsf;
		this.rsltcnt = rsltcnt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setDlco_seq(String dlco_seq){
		this.dlco_seq = dlco_seq;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setSend_plac_seq(String send_plac_seq){
		this.send_plac_seq = send_plac_seq;
	}

	public void setSend_plac_nm(String send_plac_nm){
		this.send_plac_nm = send_plac_nm;
	}

	public void setDlco_clsf(String dlco_clsf){
		this.dlco_clsf = dlco_clsf;
	}

	public void setArea(String area){
		this.area = area;
	}

	public void setPrv_curr_clsf(String prv_curr_clsf){
		this.prv_curr_clsf = prv_curr_clsf;
	}

	public void setRsltcnt(String rsltcnt){
		this.rsltcnt = rsltcnt;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getDlco_seq(){
		return this.dlco_seq;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getSend_plac_seq(){
		return this.send_plac_seq;
	}

	public String getSend_plac_nm(){
		return this.send_plac_nm;
	}

	public String getDlco_clsf(){
		return this.dlco_clsf;
	}

	public String getArea(){
		return this.area;
	}

	public String getPrv_curr_clsf(){
		return this.prv_curr_clsf;
	}

	public String getRsltcnt(){
		return this.rsltcnt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.dlco_cd = Util.checkString(cstmt.getString(9));
		this.dlco_seq = Util.checkString(cstmt.getString(10));
		this.dlco_nm = Util.checkString(cstmt.getString(11));
		this.send_plac_seq = Util.checkString(cstmt.getString(12));
		this.send_plac_nm = Util.checkString(cstmt.getString(13));
		this.dlco_clsf = Util.checkString(cstmt.getString(14));
		this.area = Util.checkString(cstmt.getString(15));
		this.prv_curr_clsf = Util.checkString(cstmt.getString(16));
		this.rsltcnt = Util.checkString(cstmt.getString(17));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PL_COM_1420_SDataSet ds = (PL_COM_1420_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getDlco_cd()%>
<%= ds.getDlco_seq()%>
<%= ds.getDlco_nm()%>
<%= ds.getSend_plac_seq()%>
<%= ds.getSend_plac_nm()%>
<%= ds.getDlco_clsf()%>
<%= ds.getArea()%>
<%= ds.getPrv_curr_clsf()%>
<%= ds.getRsltcnt()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Mar 26 16:25:38 KST 2009 */