/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ad.tax.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.tax.dm.*;
import chosun.ciis.ad.tax.rec.*;

/**
 * 
 */


public class AD_TAX_1000_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist4 = new ArrayList();
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public ArrayList curlist6 = new ArrayList();
	public ArrayList curlist5 = new ArrayList();
	public String errcode;
	public String errmsg;
	public String ern;
	public String dlco_nm;
	public String presi_nm;
	public String addr;
	public String bizcond;
	public String item;
	public String ern2;
	public String dlco_nm2;
	public String presi_nm2;
	public String addr2;
	public String bizcond2;
	public String item2;
	public String xx_dlco_clsf_cd;
	public String xx_prof_type_cd;
	public String xx_tax_item;

	public AD_TAX_1000_MDataSet(){}
	public AD_TAX_1000_MDataSet(String errcode, String errmsg, String ern, String dlco_nm, String presi_nm, String addr, String bizcond, String item, String ern2, String dlco_nm2, String presi_nm2, String addr2, String bizcond2, String item2, String xx_dlco_clsf_cd, String xx_prof_type_cd, String xx_tax_item){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.ern = ern;
		this.dlco_nm = dlco_nm;
		this.presi_nm = presi_nm;
		this.addr = addr;
		this.bizcond = bizcond;
		this.item = item;
		this.ern2 = ern2;
		this.dlco_nm2 = dlco_nm2;
		this.presi_nm2 = presi_nm2;
		this.addr2 = addr2;
		this.bizcond2 = bizcond2;
		this.item2 = item2;
		this.xx_dlco_clsf_cd = xx_dlco_clsf_cd;
		this.xx_prof_type_cd = xx_prof_type_cd;
		this.xx_tax_item = xx_tax_item;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setErn(String ern){
		this.ern = ern;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setPresi_nm(String presi_nm){
		this.presi_nm = presi_nm;
	}

	public void setAddr(String addr){
		this.addr = addr;
	}

	public void setBizcond(String bizcond){
		this.bizcond = bizcond;
	}

	public void setItem(String item){
		this.item = item;
	}

	public void setErn2(String ern2){
		this.ern2 = ern2;
	}

	public void setDlco_nm2(String dlco_nm2){
		this.dlco_nm2 = dlco_nm2;
	}

	public void setPresi_nm2(String presi_nm2){
		this.presi_nm2 = presi_nm2;
	}

	public void setAddr2(String addr2){
		this.addr2 = addr2;
	}

	public void setBizcond2(String bizcond2){
		this.bizcond2 = bizcond2;
	}

	public void setItem2(String item2){
		this.item2 = item2;
	}

	public void setXx_dlco_clsf_cd(String xx_dlco_clsf_cd){
		this.xx_dlco_clsf_cd = xx_dlco_clsf_cd;
	}

	public void setXx_prof_type_cd(String xx_prof_type_cd){
		this.xx_prof_type_cd = xx_prof_type_cd;
	}

	public void setXx_tax_item(String xx_tax_item){
		this.xx_tax_item = xx_tax_item;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getErn(){
		return this.ern;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getPresi_nm(){
		return this.presi_nm;
	}

	public String getAddr(){
		return this.addr;
	}

	public String getBizcond(){
		return this.bizcond;
	}

	public String getItem(){
		return this.item;
	}

	public String getErn2(){
		return this.ern2;
	}

	public String getDlco_nm2(){
		return this.dlco_nm2;
	}

	public String getPresi_nm2(){
		return this.presi_nm2;
	}

	public String getAddr2(){
		return this.addr2;
	}

	public String getBizcond2(){
		return this.bizcond2;
	}

	public String getItem2(){
		return this.item2;
	}

	public String getXx_dlco_clsf_cd(){
		return this.xx_dlco_clsf_cd;
	}

	public String getXx_prof_type_cd(){
		return this.xx_prof_type_cd;
	}

	public String getXx_tax_item(){
		return this.xx_tax_item;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.ern = Util.checkString(cstmt.getString(5));
		this.dlco_nm = Util.checkString(cstmt.getString(6));
		this.presi_nm = Util.checkString(cstmt.getString(7));
		this.addr = Util.checkString(cstmt.getString(8));
		this.bizcond = Util.checkString(cstmt.getString(9));
		this.item = Util.checkString(cstmt.getString(10));
		this.ern2 = Util.checkString(cstmt.getString(11));
		this.dlco_nm2 = Util.checkString(cstmt.getString(12));
		this.presi_nm2 = Util.checkString(cstmt.getString(13));
		this.addr2 = Util.checkString(cstmt.getString(14));
		this.bizcond2 = Util.checkString(cstmt.getString(15));
		this.item2 = Util.checkString(cstmt.getString(16));
		ResultSet rset0 = (ResultSet) cstmt.getObject(17);
		while(rset0.next()){
			AD_TAX_1000_MCURLIST1Record rec = new AD_TAX_1000_MCURLIST1Record();
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset0.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset0.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset0.getString("cdabrvnm_cd"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(18);
		while(rset1.next()){
			AD_TAX_1000_MCURLIST2Record rec = new AD_TAX_1000_MCURLIST2Record();
			rec.cd = Util.checkString(rset1.getString("cd"));
			rec.cdnm = Util.checkString(rset1.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset1.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset1.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset1.getString("cdabrvnm_cd"));
			this.curlist2.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(19);
		while(rset2.next()){
			AD_TAX_1000_MCURLIST3Record rec = new AD_TAX_1000_MCURLIST3Record();
			rec.cd = Util.checkString(rset2.getString("cd"));
			rec.cdnm = Util.checkString(rset2.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset2.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset2.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset2.getString("cdabrvnm_cd"));
			this.curlist3.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(20);
		while(rset3.next()){
			AD_TAX_1000_MCURLIST4Record rec = new AD_TAX_1000_MCURLIST4Record();
			rec.cd = Util.checkString(rset3.getString("cd"));
			rec.cdnm = Util.checkString(rset3.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset3.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset3.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset3.getString("cdabrvnm_cd"));
			this.curlist4.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(21);
		while(rset4.next()){
			AD_TAX_1000_MCURLIST5Record rec = new AD_TAX_1000_MCURLIST5Record();
			rec.cd = Util.checkString(rset4.getString("cd"));
			rec.cdnm = Util.checkString(rset4.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset4.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset4.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset4.getString("cdabrvnm_cd"));
			this.curlist5.add(rec);
		}
		ResultSet rset5 = (ResultSet) cstmt.getObject(22);
		while(rset5.next()){
			AD_TAX_1000_MCURLIST6Record rec = new AD_TAX_1000_MCURLIST6Record();
			rec.cd = Util.checkString(rset5.getString("cd"));
			rec.cd_abrv_nm = Util.checkString(rset5.getString("cd_abrv_nm"));
			this.curlist6.add(rec);
		}
		this.xx_dlco_clsf_cd = Util.checkString(cstmt.getString(23));
		this.xx_prof_type_cd = Util.checkString(cstmt.getString(24));
		this.xx_tax_item = Util.checkString(cstmt.getString(25));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_TAX_1000_MDataSet ds = (AD_TAX_1000_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		AD_TAX_1000_MCURLIST1Record curlist1Rec = (AD_TAX_1000_MCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		AD_TAX_1000_MCURLIST2Record curlist2Rec = (AD_TAX_1000_MCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		AD_TAX_1000_MCURLIST3Record curlist3Rec = (AD_TAX_1000_MCURLIST3Record)ds.curlist3.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist4.size(); i++){
		AD_TAX_1000_MCURLIST4Record curlist4Rec = (AD_TAX_1000_MCURLIST4Record)ds.curlist4.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist5.size(); i++){
		AD_TAX_1000_MCURLIST5Record curlist5Rec = (AD_TAX_1000_MCURLIST5Record)ds.curlist5.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist6.size(); i++){
		AD_TAX_1000_MCURLIST6Record curlist6Rec = (AD_TAX_1000_MCURLIST6Record)ds.curlist6.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getErn()%>
<%= ds.getDlco_nm()%>
<%= ds.getPresi_nm()%>
<%= ds.getAddr()%>
<%= ds.getBizcond()%>
<%= ds.getItem()%>
<%= ds.getErn2()%>
<%= ds.getDlco_nm2()%>
<%= ds.getPresi_nm2()%>
<%= ds.getAddr2()%>
<%= ds.getBizcond2()%>
<%= ds.getItem2()%>
<%= ds.getCurlist1()%>
<%= ds.getCurlist2()%>
<%= ds.getCurlist3()%>
<%= ds.getCurlist4()%>
<%= ds.getCurlist5()%>
<%= ds.getCurlist6()%>
<%= ds.getXx_dlco_clsf_cd()%>
<%= ds.getXx_prof_type_cd()%>
<%= ds.getXx_tax_item()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.cd%>
<%= curlist1Rec.cdnm%>
<%= curlist1Rec.cd_abrv_nm%>
<%= curlist1Rec.cdnm_cd%>
<%= curlist1Rec.cdabrvnm_cd%>
<%= curlist2Rec.cd%>
<%= curlist2Rec.cdnm%>
<%= curlist2Rec.cd_abrv_nm%>
<%= curlist2Rec.cdnm_cd%>
<%= curlist2Rec.cdabrvnm_cd%>
<%= curlist3Rec.cd%>
<%= curlist3Rec.cdnm%>
<%= curlist3Rec.cd_abrv_nm%>
<%= curlist3Rec.cdnm_cd%>
<%= curlist3Rec.cdabrvnm_cd%>
<%= curlist4Rec.cd%>
<%= curlist4Rec.cdnm%>
<%= curlist4Rec.cd_abrv_nm%>
<%= curlist4Rec.cdnm_cd%>
<%= curlist4Rec.cdabrvnm_cd%>
<%= curlist5Rec.cd%>
<%= curlist5Rec.cdnm%>
<%= curlist5Rec.cd_abrv_nm%>
<%= curlist5Rec.cdnm_cd%>
<%= curlist5Rec.cdabrvnm_cd%>
<%= curlist6Rec.cd%>
<%= curlist6Rec.cd_abrv_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Apr 23 16:34:51 KST 2014 */