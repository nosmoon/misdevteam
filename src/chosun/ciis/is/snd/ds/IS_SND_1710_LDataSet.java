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


package chosun.ciis.is.snd.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.snd.dm.*;
import chosun.ciis.is.snd.rec.*;

/**
 * 
 */


public class IS_SND_1710_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;
	public String wh_cd;
	public String send_dt;
	public String spc_matt_1;
	public String spc_matt_2;
	public String d_ji_cnt;
	public String d_ji_qunt;
	public String d_yo_cnt;
	public String d_yo_qunt;
	public String d_cnt;
	public String d_qunt;
	public String d_fee;
	public String m_ji_cnt;
	public String m_ji_qunt;
	public String m_yo_cnt;
	public String m_yo_qunt;
	public String m_cnt;
	public String m_qunt;
	public String m_fee;

	public IS_SND_1710_LDataSet(){}
	public IS_SND_1710_LDataSet(String errcode, String errmsg, String wh_cd, String send_dt, String spc_matt_1, String spc_matt_2, String d_ji_cnt, String d_ji_qunt, String d_yo_cnt, String d_yo_qunt, String d_cnt, String d_qunt, String d_fee, String m_ji_cnt, String m_ji_qunt, String m_yo_cnt, String m_yo_qunt, String m_cnt, String m_qunt, String m_fee){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.wh_cd = wh_cd;
		this.send_dt = send_dt;
		this.spc_matt_1 = spc_matt_1;
		this.spc_matt_2 = spc_matt_2;
		this.d_ji_cnt = d_ji_cnt;
		this.d_ji_qunt = d_ji_qunt;
		this.d_yo_cnt = d_yo_cnt;
		this.d_yo_qunt = d_yo_qunt;
		this.d_cnt = d_cnt;
		this.d_qunt = d_qunt;
		this.d_fee = d_fee;
		this.m_ji_cnt = m_ji_cnt;
		this.m_ji_qunt = m_ji_qunt;
		this.m_yo_cnt = m_yo_cnt;
		this.m_yo_qunt = m_yo_qunt;
		this.m_cnt = m_cnt;
		this.m_qunt = m_qunt;
		this.m_fee = m_fee;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setWh_cd(String wh_cd){
		this.wh_cd = wh_cd;
	}

	public void setSend_dt(String send_dt){
		this.send_dt = send_dt;
	}

	public void setSpc_matt_1(String spc_matt_1){
		this.spc_matt_1 = spc_matt_1;
	}

	public void setSpc_matt_2(String spc_matt_2){
		this.spc_matt_2 = spc_matt_2;
	}

	public void setD_ji_cnt(String d_ji_cnt){
		this.d_ji_cnt = d_ji_cnt;
	}

	public void setD_ji_qunt(String d_ji_qunt){
		this.d_ji_qunt = d_ji_qunt;
	}

	public void setD_yo_cnt(String d_yo_cnt){
		this.d_yo_cnt = d_yo_cnt;
	}

	public void setD_yo_qunt(String d_yo_qunt){
		this.d_yo_qunt = d_yo_qunt;
	}

	public void setD_cnt(String d_cnt){
		this.d_cnt = d_cnt;
	}

	public void setD_qunt(String d_qunt){
		this.d_qunt = d_qunt;
	}

	public void setD_fee(String d_fee){
		this.d_fee = d_fee;
	}

	public void setM_ji_cnt(String m_ji_cnt){
		this.m_ji_cnt = m_ji_cnt;
	}

	public void setM_ji_qunt(String m_ji_qunt){
		this.m_ji_qunt = m_ji_qunt;
	}

	public void setM_yo_cnt(String m_yo_cnt){
		this.m_yo_cnt = m_yo_cnt;
	}

	public void setM_yo_qunt(String m_yo_qunt){
		this.m_yo_qunt = m_yo_qunt;
	}

	public void setM_cnt(String m_cnt){
		this.m_cnt = m_cnt;
	}

	public void setM_qunt(String m_qunt){
		this.m_qunt = m_qunt;
	}

	public void setM_fee(String m_fee){
		this.m_fee = m_fee;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getWh_cd(){
		return this.wh_cd;
	}

	public String getSend_dt(){
		return this.send_dt;
	}

	public String getSpc_matt_1(){
		return this.spc_matt_1;
	}

	public String getSpc_matt_2(){
		return this.spc_matt_2;
	}

	public String getD_ji_cnt(){
		return this.d_ji_cnt;
	}

	public String getD_ji_qunt(){
		return this.d_ji_qunt;
	}

	public String getD_yo_cnt(){
		return this.d_yo_cnt;
	}

	public String getD_yo_qunt(){
		return this.d_yo_qunt;
	}

	public String getD_cnt(){
		return this.d_cnt;
	}

	public String getD_qunt(){
		return this.d_qunt;
	}

	public String getD_fee(){
		return this.d_fee;
	}

	public String getM_ji_cnt(){
		return this.m_ji_cnt;
	}

	public String getM_ji_qunt(){
		return this.m_ji_qunt;
	}

	public String getM_yo_cnt(){
		return this.m_yo_cnt;
	}

	public String getM_yo_qunt(){
		return this.m_yo_qunt;
	}

	public String getM_cnt(){
		return this.m_cnt;
	}

	public String getM_qunt(){
		return this.m_qunt;
	}

	public String getM_fee(){
		return this.m_fee;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.wh_cd = Util.checkString(cstmt.getString(8));
		this.send_dt = Util.checkString(cstmt.getString(9));
		this.spc_matt_1 = Util.checkString(cstmt.getString(10));
		this.spc_matt_2 = Util.checkString(cstmt.getString(11));
		this.d_ji_cnt = Util.checkString(cstmt.getString(12));
		this.d_ji_qunt = Util.checkString(cstmt.getString(13));
		this.d_yo_cnt = Util.checkString(cstmt.getString(14));
		this.d_yo_qunt = Util.checkString(cstmt.getString(15));
		this.d_cnt = Util.checkString(cstmt.getString(16));
		this.d_qunt = Util.checkString(cstmt.getString(17));
		this.d_fee = Util.checkString(cstmt.getString(18));
		this.m_ji_cnt = Util.checkString(cstmt.getString(19));
		this.m_ji_qunt = Util.checkString(cstmt.getString(20));
		this.m_yo_cnt = Util.checkString(cstmt.getString(21));
		this.m_yo_qunt = Util.checkString(cstmt.getString(22));
		this.m_cnt = Util.checkString(cstmt.getString(23));
		this.m_qunt = Util.checkString(cstmt.getString(24));
		this.m_fee = Util.checkString(cstmt.getString(25));
		ResultSet rset0 = (ResultSet) cstmt.getObject(26);
		while(rset0.next()){
			IS_SND_1710_LCURLIST1Record rec = new IS_SND_1710_LCURLIST1Record();
			rec.wh_cd = Util.checkString(rset0.getString("wh_cd"));
			rec.send_dt = Util.checkString(rset0.getString("send_dt"));
			rec.send_seq = Util.checkString(rset0.getString("send_seq"));
			rec.send_atic_no = Util.checkString(rset0.getString("send_atic_no"));
			rec.send_atic_nm = Util.checkString(rset0.getString("send_atic_nm"));
			rec.sendclsf = Util.checkString(rset0.getString("sendclsf"));
			rec.serv_ref = Util.checkString(rset0.getString("serv_ref"));
			rec.cntc_plac = Util.checkString(rset0.getString("cntc_plac"));
			rec.send_fee = Util.checkString(rset0.getString("send_fee"));
			rec.start_tm = Util.checkString(rset0.getString("start_tm"));
			rec.end_tm = Util.checkString(rset0.getString("end_tm"));
			rec.send_path = Util.checkString(rset0.getString("send_path"));
			rec.send_advt_cont = Util.checkString(rset0.getString("send_advt_cont"));
			rec.send_qunt = Util.checkString(rset0.getString("send_qunt"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			this.curlist1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	IS_SND_1710_LDataSet ds = (IS_SND_1710_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		IS_SND_1710_LCURLIST1Record curlist1Rec = (IS_SND_1710_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getWh_cd()%>
<%= ds.getSend_dt()%>
<%= ds.getSpc_matt_1()%>
<%= ds.getSpc_matt_2()%>
<%= ds.getD_ji_cnt()%>
<%= ds.getD_ji_qunt()%>
<%= ds.getD_yo_cnt()%>
<%= ds.getD_yo_qunt()%>
<%= ds.getD_cnt()%>
<%= ds.getD_qunt()%>
<%= ds.getD_fee()%>
<%= ds.getM_ji_cnt()%>
<%= ds.getM_ji_qunt()%>
<%= ds.getM_yo_cnt()%>
<%= ds.getM_yo_qunt()%>
<%= ds.getM_cnt()%>
<%= ds.getM_qunt()%>
<%= ds.getM_fee()%>
<%= ds.getCurlist1()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.wh_cd%>
<%= curlist1Rec.send_dt%>
<%= curlist1Rec.send_seq%>
<%= curlist1Rec.send_atic_no%>
<%= curlist1Rec.send_atic_nm%>
<%= curlist1Rec.sendclsf%>
<%= curlist1Rec.serv_ref%>
<%= curlist1Rec.cntc_plac%>
<%= curlist1Rec.send_fee%>
<%= curlist1Rec.start_tm%>
<%= curlist1Rec.end_tm%>
<%= curlist1Rec.send_path%>
<%= curlist1Rec.send_advt_cont%>
<%= curlist1Rec.send_qunt%>
<%= curlist1Rec.remk%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu May 31 09:13:26 KST 2012 */