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


package chosun.ciis.se.boi.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.boi.dm.*;
import chosun.ciis.se.boi.rec.*;

/**
 * 
 */


public class SE_BOI_1430_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList boheadideacur = new ArrayList();
	public ArrayList boheadhstycur = new ArrayList();
	public ArrayList boheadfamcur = new ArrayList();
	public String errcode;
	public String errmsg;
	public byte[] bo_head_phot;
	public long phot_size;
	public String bo_head_nm;
	public String bo_head_prn;
	public String tel_no;
	public String ptph_no;
	public String wedd_anvy_dd;
	public String nativ;
	public String relg;
	public String zip;
	public String addr;
	public String dtls_addr;

	public SE_BOI_1430_SDataSet(){}
	public SE_BOI_1430_SDataSet(String errcode, String errmsg, byte[] bo_head_phot, long phot_size, String bo_head_nm, String bo_head_prn, String tel_no, String ptph_no, String wedd_anvy_dd, String nativ, String relg, String zip, String addr, String dtls_addr){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.bo_head_phot = bo_head_phot;
		this.phot_size = phot_size;
		this.bo_head_nm = bo_head_nm;
		this.bo_head_prn = bo_head_prn;
		this.tel_no = tel_no;
		this.ptph_no = ptph_no;
		this.wedd_anvy_dd = wedd_anvy_dd;
		this.nativ = nativ;
		this.relg = relg;
		this.zip = zip;
		this.addr = addr;
		this.dtls_addr = dtls_addr;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setBo_head_phot(byte[] bo_head_phot){
		this.bo_head_phot = bo_head_phot;
	}

	public void setPhot_size(long phot_size){
		this.phot_size = phot_size;
	}

	public void setBo_head_nm(String bo_head_nm){
		this.bo_head_nm = bo_head_nm;
	}

	public void setBo_head_prn(String bo_head_prn){
		this.bo_head_prn = bo_head_prn;
	}

	public void setTel_no(String tel_no){
		this.tel_no = tel_no;
	}

	public void setPtph_no(String ptph_no){
		this.ptph_no = ptph_no;
	}

	public void setWedd_anvy_dd(String wedd_anvy_dd){
		this.wedd_anvy_dd = wedd_anvy_dd;
	}

	public void setNativ(String nativ){
		this.nativ = nativ;
	}

	public void setRelg(String relg){
		this.relg = relg;
	}

	public void setZip(String zip){
		this.zip = zip;
	}

	public void setAddr(String addr){
		this.addr = addr;
	}

	public void setDtls_addr(String dtls_addr){
		this.dtls_addr = dtls_addr;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public byte[] getBo_head_phot(){
		return this.bo_head_phot;
	}

	public long getPhot_size(){
		return this.phot_size;
	}

	public String getBo_head_nm(){
		return this.bo_head_nm;
	}

	public String getBo_head_prn(){
		return this.bo_head_prn;
	}

	public String getTel_no(){
		return this.tel_no;
	}

	public String getPtph_no(){
		return this.ptph_no;
	}

	public String getWedd_anvy_dd(){
		return this.wedd_anvy_dd;
	}

	public String getNativ(){
		return this.nativ;
	}

	public String getRelg(){
		return this.relg;
	}

	public String getZip(){
		return this.zip;
	}

	public String getAddr(){
		return this.addr;
	}

	public String getDtls_addr(){
		return this.dtls_addr;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		Blob blob;
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		
		blob  = cstmt.getBlob(6);
		if(blob != null)  this.bo_head_phot = blob.getBytes(1, (int)blob.length());
		this.phot_size = cstmt.getLong(7);
		this.bo_head_nm = Util.checkString(cstmt.getString(8));
		this.bo_head_prn = Util.checkString(cstmt.getString(9));
		this.tel_no = Util.checkString(cstmt.getString(10));
		this.ptph_no = Util.checkString(cstmt.getString(11));
		this.wedd_anvy_dd = Util.checkString(cstmt.getString(12));
		this.nativ = Util.checkString(cstmt.getString(13));
		this.relg = Util.checkString(cstmt.getString(14));
		this.zip = Util.checkString(cstmt.getString(15));
		this.addr = Util.checkString(cstmt.getString(16));
		this.dtls_addr = Util.checkString(cstmt.getString(17));
		ResultSet rset0 = (ResultSet) cstmt.getObject(18);
		while(rset0.next()){
			SE_BOI_1430_SBOHEADHSTYCURRecord rec = new SE_BOI_1430_SBOHEADHSTYCURRecord();
			rec.yymm = Util.checkString(rset0.getString("yymm"));
			rec.hsty_matt = Util.checkString(rset0.getString("hsty_matt"));
			this.boheadhstycur.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(19);
		while(rset1.next()){
			SE_BOI_1430_SBOHEADIDEACURRecord rec = new SE_BOI_1430_SBOHEADIDEACURRecord();
			rec.make_dt = Util.checkString(rset1.getString("make_dt"));
			rec.make_pers_nm = Util.checkString(rset1.getString("make_pers_nm"));
			rec.idea = Util.checkString(rset1.getString("idea"));
			this.boheadideacur.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(20);
		while(rset2.next()){
			SE_BOI_1430_SBOHEADFAMCURRecord rec = new SE_BOI_1430_SBOHEADFAMCURRecord();
			rec.flnm = Util.checkString(rset2.getString("flnm"));
			rec.faml_rshp_cd = Util.checkString(rset2.getString("faml_rshp_cd"));
			rec.bidt = Util.checkString(rset2.getString("bidt"));
			rec.luso_clsf = Util.checkString(rset2.getString("luso_clsf"));
			this.boheadfamcur.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_BOI_1430_SDataSet ds = (SE_BOI_1430_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.boheadhstycur.size(); i++){
		SE_BOI_1430_SBOHEADHSTYCURRecord boheadhstycurRec = (SE_BOI_1430_SBOHEADHSTYCURRecord)ds.boheadhstycur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.boheadideacur.size(); i++){
		SE_BOI_1430_SBOHEADIDEACURRecord boheadideacurRec = (SE_BOI_1430_SBOHEADIDEACURRecord)ds.boheadideacur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.boheadfamcur.size(); i++){
		SE_BOI_1430_SBOHEADFAMCURRecord boheadfamcurRec = (SE_BOI_1430_SBOHEADFAMCURRecord)ds.boheadfamcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getBo_head_phot()%>
<%= ds.getPhot_size()%>
<%= ds.getBo_head_nm()%>
<%= ds.getBo_head_prn()%>
<%= ds.getTel_no()%>
<%= ds.getPtph_no()%>
<%= ds.getWedd_anvy_dd()%>
<%= ds.getNativ()%>
<%= ds.getRelg()%>
<%= ds.getZip()%>
<%= ds.getAddr()%>
<%= ds.getDtls_addr()%>
<%= ds.getBoheadhstycur()%>
<%= ds.getBoheadideacur()%>
<%= ds.getBoheadfamcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= boheadhstycurRec.yymm%>
<%= boheadhstycurRec.hsty_matt%>
<%= boheadideacurRec.make_dt%>
<%= boheadideacurRec.make_pers_nm%>
<%= boheadideacurRec.idea%>
<%= boheadfamcurRec.flnm%>
<%= boheadfamcurRec.faml_rshp_cd%>
<%= boheadfamcurRec.bidt%>
<%= boheadfamcurRec.luso_clsf%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Feb 04 21:28:13 KST 2009 */