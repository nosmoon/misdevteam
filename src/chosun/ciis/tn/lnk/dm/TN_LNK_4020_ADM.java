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


package chosun.ciis.tn.lnk.dm;

import java.sql.*;

import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.tn.lnk.ds.*;
import chosun.ciis.tn.lnk.rec.*;

/**
 * 
 */


public class TN_LNK_4020_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String accflag;
	public String deptidx;
	public String receiverlist;
	public String receiverwritelist;
	public String receiveroption;
	public String sendtype;
	public String purpose;
	public String title;
	public String adminname;
	public String adminidx;
	public String memo;
	public String sender;
	public String senderinfo;
	public String sendtitle;
	public String sendcontents;
	public String startdate;
	public String enddate;
	public String status;
	public String memberidx;
	public String name;
	public String receiver;
	public String incmg_pers;

	public TN_LNK_4020_ADM(){}
	public TN_LNK_4020_ADM(String cmpy_cd, String accflag, String deptidx, String receiverlist, String receiverwritelist, String receiveroption, String sendtype, String purpose, String title, String adminname, String adminidx, String memo, String sender, String senderinfo, String sendtitle, String sendcontents, String startdate, String enddate, String status, String memberidx, String name, String receiver, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.accflag = accflag;
		this.deptidx = deptidx;
		this.receiverlist = receiverlist;
		this.receiverwritelist = receiverwritelist;
		this.receiveroption = receiveroption;
		this.sendtype = sendtype;
		this.purpose = purpose;
		this.title = title;
		this.adminname = adminname;
		this.adminidx = adminidx;
		this.memo = memo;
		this.sender = sender;
		this.senderinfo = senderinfo;
		this.sendtitle = sendtitle;
		this.sendcontents = sendcontents;
		this.startdate = startdate;
		this.enddate = enddate;
		this.status = status;
		this.memberidx = memberidx;
		this.name = name;
		this.receiver = receiver;
		this.incmg_pers = incmg_pers;
	}
	
	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAccflag(String accflag){
		this.accflag = accflag;
	}

	public void setDeptidx(String deptidx){
		this.deptidx = deptidx;
	}

	public void setReceiverlist(String receiverlist){
		this.receiverlist = receiverlist;
	}

	public void setReceiverwritelist(String receiverwritelist){
		this.receiverwritelist = receiverwritelist;
	}

	public void setReceiveroption(String receiveroption){
		this.receiveroption = receiveroption;
	}

	public void setSendtype(String sendtype){
		this.sendtype = sendtype;
	}

	public void setPurpose(String purpose){
		this.purpose = purpose;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public void setAdminname(String adminname){
		this.adminname = adminname;
	}

	public void setAdminidx(String adminidx){
		this.adminidx = adminidx;
	}

	public void setMemo(String memo){
		this.memo = memo;
	}

	public void setSender(String sender){
		this.sender = sender;
	}

	public void setSenderinfo(String senderinfo){
		this.senderinfo = senderinfo;
	}

	public void setSendtitle(String sendtitle){
		this.sendtitle = sendtitle;
	}

	public void setSendcontents(String sendcontents){
		this.sendcontents = sendcontents;
	}

	public void setStartdate(String startdate){
		this.startdate = startdate;
	}

	public void setEnddate(String enddate){
		this.enddate = enddate;
	}

	public void setStatus(String status){
		this.status = status;
	}

	public void setMemberidx(String memberidx){
		this.memberidx = memberidx;
	}

	public void setName(String name){
		this.name = name;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	
	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAccflag(){
		return this.accflag;
	}

	public String getDeptidx(){
		return this.deptidx;
	}

	public String getReceiverlist(){
		return this.receiverlist;
	}

	public String getReceiverwritelist(){
		return this.receiverwritelist;
	}

	public String getReceiveroption(){
		return this.receiveroption;
	}

	public String getSendtype(){
		return this.sendtype;
	}

	public String getPurpose(){
		return this.purpose;
	}

	public String getTitle(){
		return this.title;
	}

	public String getAdminname(){
		return this.adminname;
	}

	public String getAdminidx(){
		return this.adminidx;
	}

	public String getMemo(){
		return this.memo;
	}

	public String getSender(){
		return this.sender;
	}

	public String getSenderinfo(){
		return this.senderinfo;
	}

	public String getSendtitle(){
		return this.sendtitle;
	}

	public String getSendcontents(){
		return this.sendcontents;
	}

	public String getStartdate(){
		return this.startdate;
	}

	public String getEnddate(){
		return this.enddate;
	}

	public String getStatus(){
		return this.status;
	}

	public String getMemberidx(){
		return this.memberidx;
	}

	public String getName(){
		return this.name;
	}
	
	public String getReceiver() {
		return receiver;
	}
	
	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISTNN.SP_TN_LNK_4020_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		TN_LNK_4020_ADM dm = (TN_LNK_4020_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.accflag);
		cstmt.setString(5, dm.deptidx);
		cstmt.setString(6, dm.receiverlist);
		cstmt.setString(7, dm.receiverwritelist);
		cstmt.setString(8, dm.receiveroption);
		cstmt.setString(9, dm.sendtype);
		cstmt.setString(10, dm.purpose);
		cstmt.setString(11, dm.title);
		cstmt.setString(12, dm.adminname);
		cstmt.setString(13, dm.adminidx);
		cstmt.setString(14, dm.memo);
		cstmt.setString(15, dm.sender);
		cstmt.setString(16, dm.senderinfo);
		cstmt.setString(17, dm.sendtitle);
		cstmt.setString(18, dm.sendcontents);
		cstmt.setString(19, dm.startdate);
		cstmt.setString(20, dm.enddate);
		cstmt.setString(21, dm.status);
		cstmt.setString(22, dm.memberidx);
		cstmt.setString(23, dm.name);
		cstmt.setString(24, dm.receiver);
		cstmt.setString(25, dm.incmg_pers);
		cstmt.registerOutParameter(26, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.tn.lnk.ds.TN_LNK_4020_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("accflag = [" + getAccflag() + "]");
		System.out.println("deptidx = [" + getDeptidx() + "]");
		System.out.println("receiverlist = [" + getReceiverlist() + "]");
		System.out.println("receiverwritelist = [" + getReceiverwritelist() + "]");
		System.out.println("receiveroption = [" + getReceiveroption() + "]");
		System.out.println("sendtype = [" + getSendtype() + "]");
		System.out.println("purpose = [" + getPurpose() + "]");
		System.out.println("title = [" + getTitle() + "]");
		System.out.println("adminname = [" + getAdminname() + "]");
		System.out.println("adminidx = [" + getAdminidx() + "]");
		System.out.println("memo = [" + getMemo() + "]");
		System.out.println("sender = [" + getSender() + "]");
		System.out.println("senderinfo = [" + getSenderinfo() + "]");
		System.out.println("sendtitle = [" + getSendtitle() + "]");
		System.out.println("sendcontents = [" + getSendcontents() + "]");
		System.out.println("startdate = [" + getStartdate() + "]");
		System.out.println("enddate = [" + getEnddate() + "]");
		System.out.println("status = [" + getStatus() + "]");
		System.out.println("memberidx = [" + getMemberidx() + "]");
		System.out.println("name = [" + getName() + "]");
		System.out.println("receiver = [" + getReceiver() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String accflag = req.getParameter("accflag");
if( accflag == null){
	System.out.println(this.toString+" : accflag is null" );
}else{
	System.out.println(this.toString+" : accflag is "+accflag );
}
String deptidx = req.getParameter("deptidx");
if( deptidx == null){
	System.out.println(this.toString+" : deptidx is null" );
}else{
	System.out.println(this.toString+" : deptidx is "+deptidx );
}
String receiverlist = req.getParameter("receiverlist");
if( receiverlist == null){
	System.out.println(this.toString+" : receiverlist is null" );
}else{
	System.out.println(this.toString+" : receiverlist is "+receiverlist );
}
String receiverwritelist = req.getParameter("receiverwritelist");
if( receiverwritelist == null){
	System.out.println(this.toString+" : receiverwritelist is null" );
}else{
	System.out.println(this.toString+" : receiverwritelist is "+receiverwritelist );
}
String receiveroption = req.getParameter("receiveroption");
if( receiveroption == null){
	System.out.println(this.toString+" : receiveroption is null" );
}else{
	System.out.println(this.toString+" : receiveroption is "+receiveroption );
}
String sendtype = req.getParameter("sendtype");
if( sendtype == null){
	System.out.println(this.toString+" : sendtype is null" );
}else{
	System.out.println(this.toString+" : sendtype is "+sendtype );
}
String purpose = req.getParameter("purpose");
if( purpose == null){
	System.out.println(this.toString+" : purpose is null" );
}else{
	System.out.println(this.toString+" : purpose is "+purpose );
}
String title = req.getParameter("title");
if( title == null){
	System.out.println(this.toString+" : title is null" );
}else{
	System.out.println(this.toString+" : title is "+title );
}
String adminname = req.getParameter("adminname");
if( adminname == null){
	System.out.println(this.toString+" : adminname is null" );
}else{
	System.out.println(this.toString+" : adminname is "+adminname );
}
String adminidx = req.getParameter("adminidx");
if( adminidx == null){
	System.out.println(this.toString+" : adminidx is null" );
}else{
	System.out.println(this.toString+" : adminidx is "+adminidx );
}
String memo = req.getParameter("memo");
if( memo == null){
	System.out.println(this.toString+" : memo is null" );
}else{
	System.out.println(this.toString+" : memo is "+memo );
}
String sender = req.getParameter("sender");
if( sender == null){
	System.out.println(this.toString+" : sender is null" );
}else{
	System.out.println(this.toString+" : sender is "+sender );
}
String senderinfo = req.getParameter("senderinfo");
if( senderinfo == null){
	System.out.println(this.toString+" : senderinfo is null" );
}else{
	System.out.println(this.toString+" : senderinfo is "+senderinfo );
}
String sendtitle = req.getParameter("sendtitle");
if( sendtitle == null){
	System.out.println(this.toString+" : sendtitle is null" );
}else{
	System.out.println(this.toString+" : sendtitle is "+sendtitle );
}
String sendcontents = req.getParameter("sendcontents");
if( sendcontents == null){
	System.out.println(this.toString+" : sendcontents is null" );
}else{
	System.out.println(this.toString+" : sendcontents is "+sendcontents );
}
String startdate = req.getParameter("startdate");
if( startdate == null){
	System.out.println(this.toString+" : startdate is null" );
}else{
	System.out.println(this.toString+" : startdate is "+startdate );
}
String enddate = req.getParameter("enddate");
if( enddate == null){
	System.out.println(this.toString+" : enddate is null" );
}else{
	System.out.println(this.toString+" : enddate is "+enddate );
}
String status = req.getParameter("status");
if( status == null){
	System.out.println(this.toString+" : status is null" );
}else{
	System.out.println(this.toString+" : status is "+status );
}
String memberidx = req.getParameter("memberidx");
if( memberidx == null){
	System.out.println(this.toString+" : memberidx is null" );
}else{
	System.out.println(this.toString+" : memberidx is "+memberidx );
}
String name = req.getParameter("name");
if( name == null){
	System.out.println(this.toString+" : name is null" );
}else{
	System.out.println(this.toString+" : name is "+name );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String accflag = Util.checkString(req.getParameter("accflag"));
String deptidx = Util.checkString(req.getParameter("deptidx"));
String receiverlist = Util.checkString(req.getParameter("receiverlist"));
String receiverwritelist = Util.checkString(req.getParameter("receiverwritelist"));
String receiveroption = Util.checkString(req.getParameter("receiveroption"));
String sendtype = Util.checkString(req.getParameter("sendtype"));
String purpose = Util.checkString(req.getParameter("purpose"));
String title = Util.checkString(req.getParameter("title"));
String adminname = Util.checkString(req.getParameter("adminname"));
String adminidx = Util.checkString(req.getParameter("adminidx"));
String memo = Util.checkString(req.getParameter("memo"));
String sender = Util.checkString(req.getParameter("sender"));
String senderinfo = Util.checkString(req.getParameter("senderinfo"));
String sendtitle = Util.checkString(req.getParameter("sendtitle"));
String sendcontents = Util.checkString(req.getParameter("sendcontents"));
String startdate = Util.checkString(req.getParameter("startdate"));
String enddate = Util.checkString(req.getParameter("enddate"));
String status = Util.checkString(req.getParameter("status"));
String memberidx = Util.checkString(req.getParameter("memberidx"));
String name = Util.checkString(req.getParameter("name"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String accflag = Util.Uni2Ksc(Util.checkString(req.getParameter("accflag")));
String deptidx = Util.Uni2Ksc(Util.checkString(req.getParameter("deptidx")));
String receiverlist = Util.Uni2Ksc(Util.checkString(req.getParameter("receiverlist")));
String receiverwritelist = Util.Uni2Ksc(Util.checkString(req.getParameter("receiverwritelist")));
String receiveroption = Util.Uni2Ksc(Util.checkString(req.getParameter("receiveroption")));
String sendtype = Util.Uni2Ksc(Util.checkString(req.getParameter("sendtype")));
String purpose = Util.Uni2Ksc(Util.checkString(req.getParameter("purpose")));
String title = Util.Uni2Ksc(Util.checkString(req.getParameter("title")));
String adminname = Util.Uni2Ksc(Util.checkString(req.getParameter("adminname")));
String adminidx = Util.Uni2Ksc(Util.checkString(req.getParameter("adminidx")));
String memo = Util.Uni2Ksc(Util.checkString(req.getParameter("memo")));
String sender = Util.Uni2Ksc(Util.checkString(req.getParameter("sender")));
String senderinfo = Util.Uni2Ksc(Util.checkString(req.getParameter("senderinfo")));
String sendtitle = Util.Uni2Ksc(Util.checkString(req.getParameter("sendtitle")));
String sendcontents = Util.Uni2Ksc(Util.checkString(req.getParameter("sendcontents")));
String startdate = Util.Uni2Ksc(Util.checkString(req.getParameter("startdate")));
String enddate = Util.Uni2Ksc(Util.checkString(req.getParameter("enddate")));
String status = Util.Uni2Ksc(Util.checkString(req.getParameter("status")));
String memberidx = Util.Uni2Ksc(Util.checkString(req.getParameter("memberidx")));
String name = Util.Uni2Ksc(Util.checkString(req.getParameter("name")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setAccflag(accflag);
dm.setDeptidx(deptidx);
dm.setReceiverlist(receiverlist);
dm.setReceiverwritelist(receiverwritelist);
dm.setReceiveroption(receiveroption);
dm.setSendtype(sendtype);
dm.setPurpose(purpose);
dm.setTitle(title);
dm.setAdminname(adminname);
dm.setAdminidx(adminidx);
dm.setMemo(memo);
dm.setSender(sender);
dm.setSenderinfo(senderinfo);
dm.setSendtitle(sendtitle);
dm.setSendcontents(sendcontents);
dm.setStartdate(startdate);
dm.setEnddate(enddate);
dm.setStatus(status);
dm.setMemberidx(memberidx);
dm.setName(name);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Aug 30 19:34:17 KST 2016 */