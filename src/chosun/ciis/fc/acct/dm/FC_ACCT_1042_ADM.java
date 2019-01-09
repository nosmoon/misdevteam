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


public class FC_ACCT_1042_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String proc_cmpy_cd;
	public String kind;
	public String mode;
	public String acct_cd;
	public String acct_subj_nm;
	public String insd_acct_cd;
	public String incmg_pers;
	public String incmg_pers_ipadd;

	public FC_ACCT_1042_ADM(){}
	public FC_ACCT_1042_ADM(String cmpy_cd, String proc_cmpy_cd, String kind, String mode, String acct_cd, String acct_subj_nm, String insd_acct_cd, String incmg_pers, String incmg_pers_ipadd){
		this.cmpy_cd = cmpy_cd;
		this.proc_cmpy_cd = proc_cmpy_cd;
		this.kind = kind;
		this.mode = mode;
		this.acct_cd = acct_cd;
		this.acct_subj_nm = acct_subj_nm;
		this.insd_acct_cd = insd_acct_cd;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setProc_cmpy_cd(String proc_cmpy_cd){
		this.proc_cmpy_cd = proc_cmpy_cd;
	}

	public void setKind(String kind){
		this.kind = kind;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setAcct_cd(String acct_cd){
		this.acct_cd = acct_cd;
	}

	public void setAcct_subj_nm(String acct_subj_nm){
		this.acct_subj_nm = acct_subj_nm;
	}

	public void setInsd_acct_cd(String insd_acct_cd){
		this.insd_acct_cd = insd_acct_cd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getProc_cmpy_cd(){
		return this.proc_cmpy_cd;
	}

	public String getKind(){
		return this.kind;
	}

	public String getMode(){
		return this.mode;
	}

	public String getAcct_cd(){
		return this.acct_cd;
	}

	public String getAcct_subj_nm(){
		return this.acct_subj_nm;
	}

	public String getInsd_acct_cd(){
		return this.insd_acct_cd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_1042_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_1042_ADM dm = (FC_ACCT_1042_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.proc_cmpy_cd);
		cstmt.setString(5, dm.kind);
		cstmt.setString(6, dm.mode);
		cstmt.setString(7, dm.acct_cd);
		cstmt.setString(8, dm.acct_subj_nm);
		cstmt.setString(9, dm.insd_acct_cd);
		cstmt.setString(10, dm.incmg_pers);
		cstmt.setString(11, dm.incmg_pers_ipadd);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_1042_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("proc_cmpy_cd = [" + getProc_cmpy_cd() + "]");
		System.out.println("kind = [" + getKind() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("acct_cd = [" + getAcct_cd() + "]");
		System.out.println("acct_subj_nm = [" + getAcct_subj_nm() + "]");
		System.out.println("insd_acct_cd = [" + getInsd_acct_cd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
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
String proc_cmpy_cd = req.getParameter("proc_cmpy_cd");
if( proc_cmpy_cd == null){
	System.out.println(this.toString+" : proc_cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : proc_cmpy_cd is "+proc_cmpy_cd );
}
String kind = req.getParameter("kind");
if( kind == null){
	System.out.println(this.toString+" : kind is null" );
}else{
	System.out.println(this.toString+" : kind is "+kind );
}
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String acct_cd = req.getParameter("acct_cd");
if( acct_cd == null){
	System.out.println(this.toString+" : acct_cd is null" );
}else{
	System.out.println(this.toString+" : acct_cd is "+acct_cd );
}
String acct_subj_nm = req.getParameter("acct_subj_nm");
if( acct_subj_nm == null){
	System.out.println(this.toString+" : acct_subj_nm is null" );
}else{
	System.out.println(this.toString+" : acct_subj_nm is "+acct_subj_nm );
}
String insd_acct_cd = req.getParameter("insd_acct_cd");
if( insd_acct_cd == null){
	System.out.println(this.toString+" : insd_acct_cd is null" );
}else{
	System.out.println(this.toString+" : insd_acct_cd is "+insd_acct_cd );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String proc_cmpy_cd = Util.checkString(req.getParameter("proc_cmpy_cd"));
String kind = Util.checkString(req.getParameter("kind"));
String mode = Util.checkString(req.getParameter("mode"));
String acct_cd = Util.checkString(req.getParameter("acct_cd"));
String acct_subj_nm = Util.checkString(req.getParameter("acct_subj_nm"));
String insd_acct_cd = Util.checkString(req.getParameter("insd_acct_cd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String proc_cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("proc_cmpy_cd")));
String kind = Util.Uni2Ksc(Util.checkString(req.getParameter("kind")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String acct_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_cd")));
String acct_subj_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_subj_nm")));
String insd_acct_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("insd_acct_cd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setProc_cmpy_cd(proc_cmpy_cd);
dm.setKind(kind);
dm.setMode(mode);
dm.setAcct_cd(acct_cd);
dm.setAcct_subj_nm(acct_subj_nm);
dm.setInsd_acct_cd(insd_acct_cd);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jul 29 21:28:42 KST 2009 */