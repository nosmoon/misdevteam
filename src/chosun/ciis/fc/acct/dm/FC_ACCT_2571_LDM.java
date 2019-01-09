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


package chosun.ciis.fc.acct.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.acct.ds.*;
import chosun.ciis.fc.acct.rec.*;

/**
 * 
 */


public class FC_ACCT_2571_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String uid;
	public String acct_num;
	public String frdt;
	public String todt;
	public String tran_clsfy;
	public String approval;

	public FC_ACCT_2571_LDM(){}
	public FC_ACCT_2571_LDM(String cmpy_cd, String uid, String acct_num, String frdt, String todt, String tran_clsfy, String approval){
		this.cmpy_cd = cmpy_cd;
		this.uid = uid;
		this.acct_num = acct_num;
		this.frdt = frdt;
		this.todt = todt;
		this.tran_clsfy = tran_clsfy;
		this.approval = approval;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setUid(String uid){
		this.uid = uid;
	}

	public void setAcct_num(String acct_num){
		this.acct_num = acct_num;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setTran_clsfy(String tran_clsfy){
		this.tran_clsfy = tran_clsfy;
	}

	public void setApproval(String approval){
		this.approval = approval;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getUid(){
		return this.uid;
	}

	public String getAcct_num(){
		return this.acct_num;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getTran_clsfy(){
		return this.tran_clsfy;
	}

	public String getApproval(){
		return this.approval;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_2571_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_2571_LDM dm = (FC_ACCT_2571_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.uid);
		cstmt.setString(5, dm.acct_num);
		cstmt.setString(6, dm.frdt);
		cstmt.setString(7, dm.todt);
		cstmt.setString(8, dm.tran_clsfy);
		cstmt.setString(9, dm.approval);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_2571_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("uid = [" + getUid() + "]");
		System.out.println("acct_num = [" + getAcct_num() + "]");
		System.out.println("frdt = [" + getFrdt() + "]");
		System.out.println("todt = [" + getTodt() + "]");
		System.out.println("tran_clsfy = [" + getTran_clsfy() + "]");
		System.out.println("approval = [" + getApproval() + "]");
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
String uid = req.getParameter("uid");
if( uid == null){
	System.out.println(this.toString+" : uid is null" );
}else{
	System.out.println(this.toString+" : uid is "+uid );
}
String acct_num = req.getParameter("acct_num");
if( acct_num == null){
	System.out.println(this.toString+" : acct_num is null" );
}else{
	System.out.println(this.toString+" : acct_num is "+acct_num );
}
String frdt = req.getParameter("frdt");
if( frdt == null){
	System.out.println(this.toString+" : frdt is null" );
}else{
	System.out.println(this.toString+" : frdt is "+frdt );
}
String todt = req.getParameter("todt");
if( todt == null){
	System.out.println(this.toString+" : todt is null" );
}else{
	System.out.println(this.toString+" : todt is "+todt );
}
String tran_clsfy = req.getParameter("tran_clsfy");
if( tran_clsfy == null){
	System.out.println(this.toString+" : tran_clsfy is null" );
}else{
	System.out.println(this.toString+" : tran_clsfy is "+tran_clsfy );
}
String approval = req.getParameter("approval");
if( approval == null){
	System.out.println(this.toString+" : approval is null" );
}else{
	System.out.println(this.toString+" : approval is "+approval );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String uid = Util.checkString(req.getParameter("uid"));
String acct_num = Util.checkString(req.getParameter("acct_num"));
String frdt = Util.checkString(req.getParameter("frdt"));
String todt = Util.checkString(req.getParameter("todt"));
String tran_clsfy = Util.checkString(req.getParameter("tran_clsfy"));
String approval = Util.checkString(req.getParameter("approval"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String uid = Util.Uni2Ksc(Util.checkString(req.getParameter("uid")));
String acct_num = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_num")));
String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
String tran_clsfy = Util.Uni2Ksc(Util.checkString(req.getParameter("tran_clsfy")));
String approval = Util.Uni2Ksc(Util.checkString(req.getParameter("approval")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setUid(uid);
dm.setAcct_num(acct_num);
dm.setFrdt(frdt);
dm.setTodt(todt);
dm.setTran_clsfy(tran_clsfy);
dm.setApproval(approval);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Feb 13 14:52:50 KST 2012 */