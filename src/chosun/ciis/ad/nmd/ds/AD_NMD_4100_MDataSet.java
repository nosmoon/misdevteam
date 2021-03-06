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


package chosun.ciis.ad.nmd.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.nmd.dm.*;
import chosun.ciis.ad.nmd.rec.*;

/**
 * 
 */


public class AD_NMD_4100_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist4 = new ArrayList();
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public ArrayList curlist8 = new ArrayList();
	public ArrayList curlist7 = new ArrayList();
	public ArrayList curlist6 = new ArrayList();
	public ArrayList curlist5 = new ArrayList();
	public String errcode;
	public String errmsg;
	public String xx_note_clsf_cd_001;
	public String xx_note_clsf_cd_002;
	public String xx_note_clsf_cd_003;
	public String xx_note_clsf_cd_004;
	public String xx_note_clsf_cd_005;
	public String xx_job_clsf_02;
	public String xx_cd_clsf_006;
	public String xx_medi_cd_001;
	public String xx_medi_cd_002;
	public String xx_cd_clsf_007;

	public AD_NMD_4100_MDataSet(){}
	public AD_NMD_4100_MDataSet(String errcode, String errmsg, String xx_note_clsf_cd_001, String xx_note_clsf_cd_002, String xx_note_clsf_cd_003, String xx_note_clsf_cd_004, String xx_note_clsf_cd_005, String xx_job_clsf_02, String xx_cd_clsf_006, String xx_medi_cd_001, String xx_medi_cd_002, String xx_cd_clsf_007){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_note_clsf_cd_001 = xx_note_clsf_cd_001;
		this.xx_note_clsf_cd_002 = xx_note_clsf_cd_002;
		this.xx_note_clsf_cd_003 = xx_note_clsf_cd_003;
		this.xx_note_clsf_cd_004 = xx_note_clsf_cd_004;
		this.xx_note_clsf_cd_005 = xx_note_clsf_cd_005;
		this.xx_job_clsf_02 = xx_job_clsf_02;
		this.xx_cd_clsf_006 = xx_cd_clsf_006;
		this.xx_medi_cd_001 = xx_medi_cd_001;
		this.xx_medi_cd_002 = xx_medi_cd_002;
		this.xx_cd_clsf_007 = xx_cd_clsf_007;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_note_clsf_cd_001(String xx_note_clsf_cd_001){
		this.xx_note_clsf_cd_001 = xx_note_clsf_cd_001;
	}

	public void setXx_note_clsf_cd_002(String xx_note_clsf_cd_002){
		this.xx_note_clsf_cd_002 = xx_note_clsf_cd_002;
	}

	public void setXx_note_clsf_cd_003(String xx_note_clsf_cd_003){
		this.xx_note_clsf_cd_003 = xx_note_clsf_cd_003;
	}

	public void setXx_note_clsf_cd_004(String xx_note_clsf_cd_004){
		this.xx_note_clsf_cd_004 = xx_note_clsf_cd_004;
	}

	public void setXx_note_clsf_cd_005(String xx_note_clsf_cd_005){
		this.xx_note_clsf_cd_005 = xx_note_clsf_cd_005;
	}

	public void setXx_job_clsf_02(String xx_job_clsf_02){
		this.xx_job_clsf_02 = xx_job_clsf_02;
	}

	public void setXx_cd_clsf_006(String xx_cd_clsf_006){
		this.xx_cd_clsf_006 = xx_cd_clsf_006;
	}

	public void setXx_medi_cd_001(String xx_medi_cd_001){
		this.xx_medi_cd_001 = xx_medi_cd_001;
	}

	public void setXx_medi_cd_002(String xx_medi_cd_002){
		this.xx_medi_cd_002 = xx_medi_cd_002;
	}

	public void setXx_cd_clsf_007(String xx_cd_clsf_007){
		this.xx_cd_clsf_007 = xx_cd_clsf_007;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_note_clsf_cd_001(){
		return this.xx_note_clsf_cd_001;
	}

	public String getXx_note_clsf_cd_002(){
		return this.xx_note_clsf_cd_002;
	}

	public String getXx_note_clsf_cd_003(){
		return this.xx_note_clsf_cd_003;
	}

	public String getXx_note_clsf_cd_004(){
		return this.xx_note_clsf_cd_004;
	}

	public String getXx_note_clsf_cd_005(){
		return this.xx_note_clsf_cd_005;
	}

	public String getXx_job_clsf_02(){
		return this.xx_job_clsf_02;
	}

	public String getXx_cd_clsf_006(){
		return this.xx_cd_clsf_006;
	}

	public String getXx_medi_cd_001(){
		return this.xx_medi_cd_001;
	}

	public String getXx_medi_cd_002(){
		return this.xx_medi_cd_002;
	}

	public String getXx_cd_clsf_007(){
		return this.xx_cd_clsf_007;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			AD_NMD_4100_MCURLIST1Record rec = new AD_NMD_4100_MCURLIST1Record();
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			AD_NMD_4100_MCURLIST2Record rec = new AD_NMD_4100_MCURLIST2Record();
			rec.cd = Util.checkString(rset1.getString("cd"));
			rec.cdnm = Util.checkString(rset1.getString("cdnm"));
			this.curlist2.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(7);
		while(rset2.next()){
			AD_NMD_4100_MCURLIST3Record rec = new AD_NMD_4100_MCURLIST3Record();
			rec.cd = Util.checkString(rset2.getString("cd"));
			rec.cdnm = Util.checkString(rset2.getString("cdnm"));
			this.curlist3.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(8);
		while(rset3.next()){
			AD_NMD_4100_MCURLIST4Record rec = new AD_NMD_4100_MCURLIST4Record();
			rec.cd = Util.checkString(rset3.getString("cd"));
			rec.cdnm = Util.checkString(rset3.getString("cdnm"));
			this.curlist4.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(9);
		while(rset4.next()){
			AD_NMD_4100_MCURLIST5Record rec = new AD_NMD_4100_MCURLIST5Record();
			rec.cd = Util.checkString(rset4.getString("cd"));
			rec.cdnm = Util.checkString(rset4.getString("cdnm"));
			this.curlist5.add(rec);
		}
		ResultSet rset5 = (ResultSet) cstmt.getObject(10);
		while(rset5.next()){
			AD_NMD_4100_MCURLIST6Record rec = new AD_NMD_4100_MCURLIST6Record();
			rec.cd = Util.checkString(rset5.getString("cd"));
			rec.cdnm = Util.checkString(rset5.getString("cdnm"));
			this.curlist6.add(rec);
		}
		ResultSet rset6 = (ResultSet) cstmt.getObject(11);
		while(rset6.next()){
			AD_NMD_4100_MCURLIST7Record rec = new AD_NMD_4100_MCURLIST7Record();
			rec.cd = Util.checkString(rset6.getString("cd"));
			rec.cdnm = Util.checkString(rset6.getString("cdnm"));
			this.curlist7.add(rec);
		}
		ResultSet rset7 = (ResultSet) cstmt.getObject(12);
		while(rset7.next()){
			AD_NMD_4100_MCURLIST8Record rec = new AD_NMD_4100_MCURLIST8Record();
			rec.cd = Util.checkString(rset7.getString("cd"));
			rec.cdnm = Util.checkString(rset7.getString("cdnm"));
			this.curlist8.add(rec);
		}
		this.xx_note_clsf_cd_001 = Util.checkString(cstmt.getString(13));
		this.xx_note_clsf_cd_002 = Util.checkString(cstmt.getString(14));
		this.xx_note_clsf_cd_003 = Util.checkString(cstmt.getString(15));
		this.xx_note_clsf_cd_004 = Util.checkString(cstmt.getString(16));
		this.xx_note_clsf_cd_005 = Util.checkString(cstmt.getString(17));
		this.xx_job_clsf_02 = Util.checkString(cstmt.getString(18));
		this.xx_cd_clsf_006 = Util.checkString(cstmt.getString(19));
		this.xx_medi_cd_001 = Util.checkString(cstmt.getString(20));
		this.xx_medi_cd_002 = Util.checkString(cstmt.getString(21));
		this.xx_cd_clsf_007 = Util.checkString(cstmt.getString(22));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_NMD_4100_MDataSet ds = (AD_NMD_4100_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		AD_NMD_4100_MCURLIST1Record curlist1Rec = (AD_NMD_4100_MCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		AD_NMD_4100_MCURLIST2Record curlist2Rec = (AD_NMD_4100_MCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		AD_NMD_4100_MCURLIST3Record curlist3Rec = (AD_NMD_4100_MCURLIST3Record)ds.curlist3.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist4.size(); i++){
		AD_NMD_4100_MCURLIST4Record curlist4Rec = (AD_NMD_4100_MCURLIST4Record)ds.curlist4.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist5.size(); i++){
		AD_NMD_4100_MCURLIST5Record curlist5Rec = (AD_NMD_4100_MCURLIST5Record)ds.curlist5.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist6.size(); i++){
		AD_NMD_4100_MCURLIST6Record curlist6Rec = (AD_NMD_4100_MCURLIST6Record)ds.curlist6.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist7.size(); i++){
		AD_NMD_4100_MCURLIST7Record curlist7Rec = (AD_NMD_4100_MCURLIST7Record)ds.curlist7.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist8.size(); i++){
		AD_NMD_4100_MCURLIST8Record curlist8Rec = (AD_NMD_4100_MCURLIST8Record)ds.curlist8.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
<%= ds.getCurlist2()%>
<%= ds.getCurlist3()%>
<%= ds.getCurlist4()%>
<%= ds.getCurlist5()%>
<%= ds.getCurlist6()%>
<%= ds.getCurlist7()%>
<%= ds.getCurlist8()%>
<%= ds.getXx_note_clsf_cd_001()%>
<%= ds.getXx_note_clsf_cd_002()%>
<%= ds.getXx_note_clsf_cd_003()%>
<%= ds.getXx_note_clsf_cd_004()%>
<%= ds.getXx_note_clsf_cd_005()%>
<%= ds.getXx_job_clsf_02()%>
<%= ds.getXx_cd_clsf_006()%>
<%= ds.getXx_medi_cd_001()%>
<%= ds.getXx_medi_cd_002()%>
<%= ds.getXx_cd_clsf_007()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.cd%>
<%= curlist1Rec.cdnm%>
<%= curlist2Rec.cd%>
<%= curlist2Rec.cdnm%>
<%= curlist3Rec.cd%>
<%= curlist3Rec.cdnm%>
<%= curlist4Rec.cd%>
<%= curlist4Rec.cdnm%>
<%= curlist5Rec.cd%>
<%= curlist5Rec.cdnm%>
<%= curlist6Rec.cd%>
<%= curlist6Rec.cdnm%>
<%= curlist7Rec.cd%>
<%= curlist7Rec.cdnm%>
<%= curlist8Rec.cd%>
<%= curlist8Rec.cdnm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Apr 07 16:48:38 KST 2014 */