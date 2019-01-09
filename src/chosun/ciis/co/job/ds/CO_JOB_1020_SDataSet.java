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


package chosun.ciis.co.job.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.co.job.dm.*;
import chosun.ciis.co.job.rec.*;
import java.io.Reader;
import java.io.IOException;
/**
 * 
 */


public class CO_JOB_1020_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList rmsgcurlist = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String job_clsf;
	public String cntc_seq;
	public String make_pers;
	public String make_dt;
	public String answer_yn;
	public String sms_yn;
	public String titl;
	public String cont;
	public String add_file_nm;
	public String frdt;
	public String todt;

	public CO_JOB_1020_SDataSet(){}
	public CO_JOB_1020_SDataSet(String errcode, String errmsg, String job_clsf, String cntc_seq, String make_pers, String make_dt, String answer_yn, String sms_yn, String titl, String cont, String add_file_nm, String frdt, String todt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.job_clsf = job_clsf;
		this.cntc_seq = cntc_seq;
		this.make_pers = make_pers;
		this.make_dt = make_dt;
		this.answer_yn = answer_yn;
		this.sms_yn = sms_yn;
		this.titl = titl;
		this.cont = cont;
		this.add_file_nm = add_file_nm;
		this.frdt = frdt;
		this.todt = todt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setJob_clsf(String job_clsf){
		this.job_clsf = job_clsf;
	}

	public void setCntc_seq(String cntc_seq){
		this.cntc_seq = cntc_seq;
	}

	public void setMake_pers(String make_pers){
		this.make_pers = make_pers;
	}

	public void setMake_dt(String make_dt){
		this.make_dt = make_dt;
	}

	public void setAnswer_yn(String answer_yn){
		this.answer_yn = answer_yn;
	}

	public void setSms_yn(String sms_yn){
		this.sms_yn = sms_yn;
	}

	public void setTitl(String titl){
		this.titl = titl;
	}

	public void setCont(String cont){
		this.cont = cont;
	}

	public void setAdd_file_nm(String add_file_nm){
		this.add_file_nm = add_file_nm;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getJob_clsf(){
		return this.job_clsf;
	}

	public String getCntc_seq(){
		return this.cntc_seq;
	}

	public String getMake_pers(){
		return this.make_pers;
	}

	public String getMake_dt(){
		return this.make_dt;
	}

	public String getAnswer_yn(){
		return this.answer_yn;
	}

	public String getSms_yn(){
		return this.sms_yn;
	}

	public String getTitl(){
		return this.titl;
	}

	public String getCont(){
		return this.cont;
	}

	public String getAdd_file_nm(){
		return this.add_file_nm;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getTodt(){
		return this.todt;
	}
	
	public static String readStreamToString(Reader reader){
        StringBuffer data = new StringBuffer();
        char[] buf = new char[1024];
        int cnt = 0;
        if (null != reader) {
            try {
				while ( (cnt = reader.read(buf)) != -1) {
				    data.append(buf, 0, cnt);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
        return data.toString();
    }
	
	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.job_clsf = Util.checkString(cstmt.getString(4));
		this.cntc_seq = Util.checkString(cstmt.getString(5));
		this.make_pers = Util.checkString(cstmt.getString(6));
		this.make_dt = Util.checkString(cstmt.getString(7));
		this.answer_yn = Util.checkString(cstmt.getString(8));
		this.sms_yn = Util.checkString(cstmt.getString(9));
		this.titl = Util.checkString(cstmt.getString(10));
		this.cont = readStreamToString(((ResultSet) cstmt).getCharacterStream(11));//Util.checkString(cstmt.getString(11));
		this.add_file_nm = Util.checkString(cstmt.getString(12));
		this.frdt = Util.checkString(cstmt.getString(13));
		this.todt = Util.checkString(cstmt.getString(14));
		ResultSet rset0 = (ResultSet) cstmt.getObject(15);
		while(rset0.next()){
			CO_JOB_1020_SCURLISTRecord rec = new CO_JOB_1020_SCURLISTRecord();
			rec.team_cd = Util.checkString(rset0.getString("team_cd"));
			rec.team_nm = Util.checkString(rset0.getString("team_nm"));
			rec.part_cd = Util.checkString(rset0.getString("part_cd"));
			rec.part_nm = Util.checkString(rset0.getString("part_nm"));
			rec.rmsg_pers = Util.checkString(rset0.getString("rmsg_pers"));
			rec.rmsg_pers_nm = Util.checkString(rset0.getString("rmsg_pers_nm"));
			rec.ptph_no = Util.checkString(rset0.getString("ptph_no"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(16);
		while(rset1.next()){
			CO_JOB_1020_SRMSGCURLISTRecord rec = new CO_JOB_1020_SRMSGCURLISTRecord();
			rec.job_clsf = Util.checkString(rset1.getString("job_clsf"));
			rec.cntc_seq = Util.checkString(rset1.getString("cntc_seq"));
			rec.rmsg_seq = Util.checkString(rset1.getString("rmsg_seq"));
			rec.rmsg_pers_nm = Util.checkString(rset1.getString("rmsg_pers_nm"));
			rec.answer_cont = Util.checkString(rset1.getString("answer_cont"));
			rec.add_file_nm = Util.checkString(rset1.getString("add_file_nm"));
			rec.answer_dt = Util.checkString(rset1.getString("answer_dt"));
			rec.team_nm = Util.checkString(rset1.getString("team_nm"));
			rec.part_nm = Util.checkString(rset1.getString("part_nm"));
			this.rmsgcurlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	CO_JOB_1020_SDataSet ds = (CO_JOB_1020_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		CO_JOB_1020_SCURLISTRecord curlistRec = (CO_JOB_1020_SCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.rmsgcurlist.size(); i++){
		CO_JOB_1020_SRMSGCURLISTRecord rmsgcurlistRec = (CO_JOB_1020_SRMSGCURLISTRecord)ds.rmsgcurlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getJob_clsf()%>
<%= ds.getCntc_seq()%>
<%= ds.getMake_pers()%>
<%= ds.getMake_dt()%>
<%= ds.getAnswer_yn()%>
<%= ds.getSms_yn()%>
<%= ds.getTitl()%>
<%= ds.getCont()%>
<%= ds.getAdd_file_nm()%>
<%= ds.getFrdt()%>
<%= ds.getTodt()%>
<%= ds.getCurlist()%>
<%= ds.getRmsgcurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.team_cd%>
<%= curlistRec.team_nm%>
<%= curlistRec.part_cd%>
<%= curlistRec.part_nm%>
<%= curlistRec.rmsg_pers%>
<%= curlistRec.rmsg_pers_nm%>
<%= curlistRec.ptph_no%>
<%= rmsgcurlistRec.job_clsf%>
<%= rmsgcurlistRec.cntc_seq%>
<%= rmsgcurlistRec.rmsg_seq%>
<%= rmsgcurlistRec.rmsg_pers_nm%>
<%= rmsgcurlistRec.answer_cont%>
<%= rmsgcurlistRec.add_file_nm%>
<%= rmsgcurlistRec.answer_dt%>
<%= rmsgcurlistRec.team_nm%>
<%= rmsgcurlistRec.part_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon May 11 11:47:53 KST 2009 */