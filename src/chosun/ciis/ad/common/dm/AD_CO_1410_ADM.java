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


package chosun.ciis.ad.common.dm;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import somo.framework.db.BaseDM;
import somo.framework.db.BaseDataSet;

/**
 * 
 */


public class AD_CO_1410_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String grp_cmpy_cd;
	public String dlco_no;
	public String old_grp_cmpy_cd;
	public String old_dlco_no;
	public String incmg_pers_ip;
	public String incmg_pers;
	public String mode;
	public String flag;

	public AD_CO_1410_ADM(){}
	public AD_CO_1410_ADM(String cmpy_cd, String grp_cmpy_cd, String dlco_no, String old_grp_cmpy_cd, String old_dlco_no, String incmg_pers_ip, String incmg_pers, String mode, String flag){
		this.cmpy_cd = cmpy_cd;
		this.grp_cmpy_cd = grp_cmpy_cd;
		this.dlco_no = dlco_no;
		this.old_grp_cmpy_cd = old_grp_cmpy_cd;
		this.old_dlco_no = old_dlco_no;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
		this.mode = mode;
		this.flag = flag;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setGrp_cmpy_cd(String grp_cmpy_cd){
		this.grp_cmpy_cd = grp_cmpy_cd;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setOld_grp_cmpy_cd(String old_grp_cmpy_cd){
		this.old_grp_cmpy_cd = old_grp_cmpy_cd;
	}

	public void setOld_dlco_no(String old_dlco_no){
		this.old_dlco_no = old_dlco_no;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setFlag(String flag){
		this.flag = flag;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getGrp_cmpy_cd(){
		return this.grp_cmpy_cd;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getOld_grp_cmpy_cd(){
		return this.old_grp_cmpy_cd;
	}

	public String getOld_dlco_no(){
		return this.old_dlco_no;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getMode(){
		return this.mode;
	}

	public String getFlag(){
		return this.flag;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_CO_1410_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_CO_1410_ADM dm = (AD_CO_1410_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.grp_cmpy_cd);
		cstmt.setString(5, dm.dlco_no);
		cstmt.setString(6, dm.old_grp_cmpy_cd);
		cstmt.setString(7, dm.old_dlco_no);
		cstmt.setString(8, dm.incmg_pers_ip);
		cstmt.setString(9, dm.incmg_pers);
		cstmt.setString(10, dm.mode);
		cstmt.setString(11, dm.flag);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.common.ds.AD_CO_1410_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("grp_cmpy_cd = [" + getGrp_cmpy_cd() + "]");
		System.out.println("dlco_no = [" + getDlco_no() + "]");
		System.out.println("old_grp_cmpy_cd = [" + getOld_grp_cmpy_cd() + "]");
		System.out.println("old_dlco_no = [" + getOld_dlco_no() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("flag = [" + getFlag() + "]");
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
String grp_cmpy_cd = req.getParameter("grp_cmpy_cd");
if( grp_cmpy_cd == null){
	System.out.println(this.toString+" : grp_cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : grp_cmpy_cd is "+grp_cmpy_cd );
}
String dlco_no = req.getParameter("dlco_no");
if( dlco_no == null){
	System.out.println(this.toString+" : dlco_no is null" );
}else{
	System.out.println(this.toString+" : dlco_no is "+dlco_no );
}
String old_grp_cmpy_cd = req.getParameter("old_grp_cmpy_cd");
if( old_grp_cmpy_cd == null){
	System.out.println(this.toString+" : old_grp_cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : old_grp_cmpy_cd is "+old_grp_cmpy_cd );
}
String old_dlco_no = req.getParameter("old_dlco_no");
if( old_dlco_no == null){
	System.out.println(this.toString+" : old_dlco_no is null" );
}else{
	System.out.println(this.toString+" : old_dlco_no is "+old_dlco_no );
}
String incmg_pers_ip = req.getParameter("incmg_pers_ip");
if( incmg_pers_ip == null){
	System.out.println(this.toString+" : incmg_pers_ip is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ip is "+incmg_pers_ip );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String flag = req.getParameter("flag");
if( flag == null){
	System.out.println(this.toString+" : flag is null" );
}else{
	System.out.println(this.toString+" : flag is "+flag );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String grp_cmpy_cd = Util.checkString(req.getParameter("grp_cmpy_cd"));
String dlco_no = Util.checkString(req.getParameter("dlco_no"));
String old_grp_cmpy_cd = Util.checkString(req.getParameter("old_grp_cmpy_cd"));
String old_dlco_no = Util.checkString(req.getParameter("old_dlco_no"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String mode = Util.checkString(req.getParameter("mode"));
String flag = Util.checkString(req.getParameter("flag"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String grp_cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("grp_cmpy_cd")));
String dlco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_no")));
String old_grp_cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("old_grp_cmpy_cd")));
String old_dlco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("old_dlco_no")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String flag = Util.Uni2Ksc(Util.checkString(req.getParameter("flag")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setGrp_cmpy_cd(grp_cmpy_cd);
dm.setDlco_no(dlco_no);
dm.setOld_grp_cmpy_cd(old_grp_cmpy_cd);
dm.setOld_dlco_no(old_dlco_no);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
dm.setMode(mode);
dm.setFlag(flag);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jul 01 17:00:10 KST 2009 */