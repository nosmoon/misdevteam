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


public class FC_ACCT_2861_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String uid;
	public String rcpm_shet_kind;
	public String rcpm_shet_no_fr;
	public String rcpm_shet_no_to;
	public String rcpm_clsf_cd;
	public String rcpm_shet_dlv_dt_fr;
	public String rcpm_shet_dlv_dt_to;
	public String dept_no;

	public FC_ACCT_2861_LDM(){}
	public FC_ACCT_2861_LDM(String cmpy_cd, String uid, String rcpm_shet_kind, String rcpm_shet_no_fr, String rcpm_shet_no_to, String rcpm_clsf_cd, String rcpm_shet_dlv_dt_fr, String rcpm_shet_dlv_dt_to, String dept_no){
		this.cmpy_cd = cmpy_cd;
		this.uid = uid;
		this.rcpm_shet_kind = rcpm_shet_kind;
		this.rcpm_shet_no_fr = rcpm_shet_no_fr;
		this.rcpm_shet_no_to = rcpm_shet_no_to;
		this.rcpm_clsf_cd = rcpm_clsf_cd;
		this.rcpm_shet_dlv_dt_fr = rcpm_shet_dlv_dt_fr;
		this.rcpm_shet_dlv_dt_to = rcpm_shet_dlv_dt_to;
		this.dept_no = dept_no;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setUid(String uid){
		this.uid = uid;
	}

	public void setRcpm_shet_kind(String rcpm_shet_kind){
		this.rcpm_shet_kind = rcpm_shet_kind;
	}

	public void setRcpm_shet_no_fr(String rcpm_shet_no_fr){
		this.rcpm_shet_no_fr = rcpm_shet_no_fr;
	}

	public void setRcpm_shet_no_to(String rcpm_shet_no_to){
		this.rcpm_shet_no_to = rcpm_shet_no_to;
	}

	public void setRcpm_clsf_cd(String rcpm_clsf_cd){
		this.rcpm_clsf_cd = rcpm_clsf_cd;
	}

	public void setRcpm_shet_dlv_dt_fr(String rcpm_shet_dlv_dt_fr){
		this.rcpm_shet_dlv_dt_fr = rcpm_shet_dlv_dt_fr;
	}

	public void setRcpm_shet_dlv_dt_to(String rcpm_shet_dlv_dt_to){
		this.rcpm_shet_dlv_dt_to = rcpm_shet_dlv_dt_to;
	}

	public void setDept_no(String dept_no){
		this.dept_no = dept_no;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getUid(){
		return this.uid;
	}

	public String getRcpm_shet_kind(){
		return this.rcpm_shet_kind;
	}

	public String getRcpm_shet_no_fr(){
		return this.rcpm_shet_no_fr;
	}

	public String getRcpm_shet_no_to(){
		return this.rcpm_shet_no_to;
	}

	public String getRcpm_clsf_cd(){
		return this.rcpm_clsf_cd;
	}

	public String getRcpm_shet_dlv_dt_fr(){
		return this.rcpm_shet_dlv_dt_fr;
	}

	public String getRcpm_shet_dlv_dt_to(){
		return this.rcpm_shet_dlv_dt_to;
	}

	public String getDept_no(){
		return this.dept_no;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_2861_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_2861_LDM dm = (FC_ACCT_2861_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.uid);
		cstmt.setString(5, dm.rcpm_shet_kind);
		cstmt.setString(6, dm.rcpm_shet_no_fr);
		cstmt.setString(7, dm.rcpm_shet_no_to);
		cstmt.setString(8, dm.rcpm_clsf_cd);
		cstmt.setString(9, dm.rcpm_shet_dlv_dt_fr);
		cstmt.setString(10, dm.rcpm_shet_dlv_dt_to);
		cstmt.setString(11, dm.dept_no);
		cstmt.registerOutParameter(12, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_2861_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("uid = [" + getUid() + "]");
		System.out.println("rcpm_shet_kind = [" + getRcpm_shet_kind() + "]");
		System.out.println("rcpm_shet_no_fr = [" + getRcpm_shet_no_fr() + "]");
		System.out.println("rcpm_shet_no_to = [" + getRcpm_shet_no_to() + "]");
		System.out.println("rcpm_clsf_cd = [" + getRcpm_clsf_cd() + "]");
		System.out.println("rcpm_shet_dlv_dt_fr = [" + getRcpm_shet_dlv_dt_fr() + "]");
		System.out.println("rcpm_shet_dlv_dt_to = [" + getRcpm_shet_dlv_dt_to() + "]");
		System.out.println("dept_no = [" + getDept_no() + "]");
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
String rcpm_shet_kind = req.getParameter("rcpm_shet_kind");
if( rcpm_shet_kind == null){
	System.out.println(this.toString+" : rcpm_shet_kind is null" );
}else{
	System.out.println(this.toString+" : rcpm_shet_kind is "+rcpm_shet_kind );
}
String rcpm_shet_no_fr = req.getParameter("rcpm_shet_no_fr");
if( rcpm_shet_no_fr == null){
	System.out.println(this.toString+" : rcpm_shet_no_fr is null" );
}else{
	System.out.println(this.toString+" : rcpm_shet_no_fr is "+rcpm_shet_no_fr );
}
String rcpm_shet_no_to = req.getParameter("rcpm_shet_no_to");
if( rcpm_shet_no_to == null){
	System.out.println(this.toString+" : rcpm_shet_no_to is null" );
}else{
	System.out.println(this.toString+" : rcpm_shet_no_to is "+rcpm_shet_no_to );
}
String rcpm_clsf_cd = req.getParameter("rcpm_clsf_cd");
if( rcpm_clsf_cd == null){
	System.out.println(this.toString+" : rcpm_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : rcpm_clsf_cd is "+rcpm_clsf_cd );
}
String rcpm_shet_dlv_dt_fr = req.getParameter("rcpm_shet_dlv_dt_fr");
if( rcpm_shet_dlv_dt_fr == null){
	System.out.println(this.toString+" : rcpm_shet_dlv_dt_fr is null" );
}else{
	System.out.println(this.toString+" : rcpm_shet_dlv_dt_fr is "+rcpm_shet_dlv_dt_fr );
}
String rcpm_shet_dlv_dt_to = req.getParameter("rcpm_shet_dlv_dt_to");
if( rcpm_shet_dlv_dt_to == null){
	System.out.println(this.toString+" : rcpm_shet_dlv_dt_to is null" );
}else{
	System.out.println(this.toString+" : rcpm_shet_dlv_dt_to is "+rcpm_shet_dlv_dt_to );
}
String dept_no = req.getParameter("dept_no");
if( dept_no == null){
	System.out.println(this.toString+" : dept_no is null" );
}else{
	System.out.println(this.toString+" : dept_no is "+dept_no );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String uid = Util.checkString(req.getParameter("uid"));
String rcpm_shet_kind = Util.checkString(req.getParameter("rcpm_shet_kind"));
String rcpm_shet_no_fr = Util.checkString(req.getParameter("rcpm_shet_no_fr"));
String rcpm_shet_no_to = Util.checkString(req.getParameter("rcpm_shet_no_to"));
String rcpm_clsf_cd = Util.checkString(req.getParameter("rcpm_clsf_cd"));
String rcpm_shet_dlv_dt_fr = Util.checkString(req.getParameter("rcpm_shet_dlv_dt_fr"));
String rcpm_shet_dlv_dt_to = Util.checkString(req.getParameter("rcpm_shet_dlv_dt_to"));
String dept_no = Util.checkString(req.getParameter("dept_no"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String uid = Util.Uni2Ksc(Util.checkString(req.getParameter("uid")));
String rcpm_shet_kind = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_shet_kind")));
String rcpm_shet_no_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_shet_no_fr")));
String rcpm_shet_no_to = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_shet_no_to")));
String rcpm_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_clsf_cd")));
String rcpm_shet_dlv_dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_shet_dlv_dt_fr")));
String rcpm_shet_dlv_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_shet_dlv_dt_to")));
String dept_no = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_no")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setUid(uid);
dm.setRcpm_shet_kind(rcpm_shet_kind);
dm.setRcpm_shet_no_fr(rcpm_shet_no_fr);
dm.setRcpm_shet_no_to(rcpm_shet_no_to);
dm.setRcpm_clsf_cd(rcpm_clsf_cd);
dm.setRcpm_shet_dlv_dt_fr(rcpm_shet_dlv_dt_fr);
dm.setRcpm_shet_dlv_dt_to(rcpm_shet_dlv_dt_to);
dm.setDept_no(dept_no);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jul 16 10:45:23 KST 2009 */