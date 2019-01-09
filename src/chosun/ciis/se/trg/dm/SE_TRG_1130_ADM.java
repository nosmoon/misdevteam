/***************************************************************************************************
* 파일명 : .java
* 기능 : 판매시스템
* 작성일자 : 2009-02-18
* 작성자 : 배창희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.trg.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.trg.ds.*;
import chosun.ciis.se.trg.rec.*;

/**
 * 
 */


public class SE_TRG_1130_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String busn_dept_yn;
	public String area_cd;
	public String bo_cd;
	public String bo_seq;
	public String yyyy;
	public String mode_ar;
	public String trgt_clsf_ar;
	public String trgt_01_ar;
	public String trgt_02_ar;
	public String trgt_03_ar;
	public String trgt_04_ar;
	public String trgt_05_ar;
	public String trgt_06_ar;
	public String trgt_07_ar;
	public String trgt_08_ar;
	public String trgt_09_ar;
	public String trgt_10_ar;
	public String trgt_11_ar;
	public String trgt_12_ar;
	public String incmg_pers;
	public String incmg_pers_ip;

	public SE_TRG_1130_ADM(){}
	public SE_TRG_1130_ADM(String cmpy_cd, String busn_dept_yn, String area_cd, String bo_cd, String bo_seq, String yyyy, String mode_ar, String trgt_clsf_ar, String trgt_01_ar, String trgt_02_ar, String trgt_03_ar, String trgt_04_ar, String trgt_05_ar, String trgt_06_ar, String trgt_07_ar, String trgt_08_ar, String trgt_09_ar, String trgt_10_ar, String trgt_11_ar, String trgt_12_ar, String incmg_pers, String incmg_pers_ip){
		this.cmpy_cd = cmpy_cd;
		this.busn_dept_yn = busn_dept_yn;
		this.area_cd = area_cd;
		this.bo_cd = bo_cd;
		this.bo_seq = bo_seq;
		this.yyyy = yyyy;
		this.mode_ar = mode_ar;
		this.trgt_clsf_ar = trgt_clsf_ar;
		this.trgt_01_ar = trgt_01_ar;
		this.trgt_02_ar = trgt_02_ar;
		this.trgt_03_ar = trgt_03_ar;
		this.trgt_04_ar = trgt_04_ar;
		this.trgt_05_ar = trgt_05_ar;
		this.trgt_06_ar = trgt_06_ar;
		this.trgt_07_ar = trgt_07_ar;
		this.trgt_08_ar = trgt_08_ar;
		this.trgt_09_ar = trgt_09_ar;
		this.trgt_10_ar = trgt_10_ar;
		this.trgt_11_ar = trgt_11_ar;
		this.trgt_12_ar = trgt_12_ar;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setBusn_dept_yn(String busn_dept_yn){
		this.busn_dept_yn = busn_dept_yn;
	}

	public void setArea_cd(String area_cd){
		this.area_cd = area_cd;
	}

	public void setBo_cd(String bo_cd){
		this.bo_cd = bo_cd;
	}

	public void setBo_seq(String bo_seq){
		this.bo_seq = bo_seq;
	}

	public void setYyyy(String yyyy){
		this.yyyy = yyyy;
	}

	public void setMode_ar(String mode_ar){
		this.mode_ar = mode_ar;
	}

	public void setTrgt_clsf_ar(String trgt_clsf_ar){
		this.trgt_clsf_ar = trgt_clsf_ar;
	}

	public void setTrgt_01_ar(String trgt_01_ar){
		this.trgt_01_ar = trgt_01_ar;
	}

	public void setTrgt_02_ar(String trgt_02_ar){
		this.trgt_02_ar = trgt_02_ar;
	}

	public void setTrgt_03_ar(String trgt_03_ar){
		this.trgt_03_ar = trgt_03_ar;
	}

	public void setTrgt_04_ar(String trgt_04_ar){
		this.trgt_04_ar = trgt_04_ar;
	}

	public void setTrgt_05_ar(String trgt_05_ar){
		this.trgt_05_ar = trgt_05_ar;
	}

	public void setTrgt_06_ar(String trgt_06_ar){
		this.trgt_06_ar = trgt_06_ar;
	}

	public void setTrgt_07_ar(String trgt_07_ar){
		this.trgt_07_ar = trgt_07_ar;
	}

	public void setTrgt_08_ar(String trgt_08_ar){
		this.trgt_08_ar = trgt_08_ar;
	}

	public void setTrgt_09_ar(String trgt_09_ar){
		this.trgt_09_ar = trgt_09_ar;
	}

	public void setTrgt_10_ar(String trgt_10_ar){
		this.trgt_10_ar = trgt_10_ar;
	}

	public void setTrgt_11_ar(String trgt_11_ar){
		this.trgt_11_ar = trgt_11_ar;
	}

	public void setTrgt_12_ar(String trgt_12_ar){
		this.trgt_12_ar = trgt_12_ar;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getBusn_dept_yn(){
		return this.busn_dept_yn;
	}

	public String getArea_cd(){
		return this.area_cd;
	}

	public String getBo_cd(){
		return this.bo_cd;
	}

	public String getBo_seq(){
		return this.bo_seq;
	}

	public String getYyyy(){
		return this.yyyy;
	}

	public String getMode_ar(){
		return this.mode_ar;
	}

	public String getTrgt_clsf_ar(){
		return this.trgt_clsf_ar;
	}

	public String getTrgt_01_ar(){
		return this.trgt_01_ar;
	}

	public String getTrgt_02_ar(){
		return this.trgt_02_ar;
	}

	public String getTrgt_03_ar(){
		return this.trgt_03_ar;
	}

	public String getTrgt_04_ar(){
		return this.trgt_04_ar;
	}

	public String getTrgt_05_ar(){
		return this.trgt_05_ar;
	}

	public String getTrgt_06_ar(){
		return this.trgt_06_ar;
	}

	public String getTrgt_07_ar(){
		return this.trgt_07_ar;
	}

	public String getTrgt_08_ar(){
		return this.trgt_08_ar;
	}

	public String getTrgt_09_ar(){
		return this.trgt_09_ar;
	}

	public String getTrgt_10_ar(){
		return this.trgt_10_ar;
	}

	public String getTrgt_11_ar(){
		return this.trgt_11_ar;
	}

	public String getTrgt_12_ar(){
		return this.trgt_12_ar;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SE_TRG_1130_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_TRG_1130_ADM dm = (SE_TRG_1130_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.busn_dept_yn);
		cstmt.setString(5, dm.area_cd);
		cstmt.setString(6, dm.bo_cd);
		cstmt.setString(7, dm.bo_seq);
		cstmt.setString(8, dm.yyyy);
		cstmt.setString(9, dm.mode_ar);
		cstmt.setString(10, dm.trgt_clsf_ar);
		cstmt.setString(11, dm.trgt_01_ar);
		cstmt.setString(12, dm.trgt_02_ar);
		cstmt.setString(13, dm.trgt_03_ar);
		cstmt.setString(14, dm.trgt_04_ar);
		cstmt.setString(15, dm.trgt_05_ar);
		cstmt.setString(16, dm.trgt_06_ar);
		cstmt.setString(17, dm.trgt_07_ar);
		cstmt.setString(18, dm.trgt_08_ar);
		cstmt.setString(19, dm.trgt_09_ar);
		cstmt.setString(20, dm.trgt_10_ar);
		cstmt.setString(21, dm.trgt_11_ar);
		cstmt.setString(22, dm.trgt_12_ar);
		cstmt.setString(23, dm.incmg_pers);
		cstmt.setString(24, dm.incmg_pers_ip);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.trg.ds.SE_TRG_1130_ADataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("busn_dept_yn = " + getBusn_dept_yn());
        System.out.println("area_cd = " + getArea_cd());
        System.out.println("bo_cd = " + getBo_cd());
        System.out.println("bo_seq = " + getBo_seq());
        System.out.println("yyyy = " + getYyyy());
        System.out.println("mode_ar = " + getMode_ar());
        System.out.println("trgt_clsf_ar = " + getTrgt_clsf_ar());
        System.out.println("trgt_01_ar = " + getTrgt_01_ar());
        System.out.println("trgt_02_ar = " + getTrgt_02_ar());
        System.out.println("trgt_03_ar = " + getTrgt_03_ar());
        System.out.println("trgt_04_ar = " + getTrgt_04_ar());
        System.out.println("trgt_05_ar = " + getTrgt_05_ar());
        System.out.println("trgt_06_ar = " + getTrgt_06_ar());
        System.out.println("trgt_07_ar = " + getTrgt_07_ar());
        System.out.println("trgt_08_ar = " + getTrgt_08_ar());
        System.out.println("trgt_09_ar = " + getTrgt_09_ar());
        System.out.println("trgt_10_ar = " + getTrgt_10_ar());
        System.out.println("trgt_11_ar = " + getTrgt_11_ar());
        System.out.println("trgt_12_ar = " + getTrgt_12_ar());
        System.out.println("incmg_pers = " + getIncmg_pers());
        System.out.println("incmg_pers_ip = " + getIncmg_pers_ip());
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
String busn_dept_yn = req.getParameter("busn_dept_yn");
if( busn_dept_yn == null){
	System.out.println(this.toString+" : busn_dept_yn is null" );
}else{
	System.out.println(this.toString+" : busn_dept_yn is "+busn_dept_yn );
}
String area_cd = req.getParameter("area_cd");
if( area_cd == null){
	System.out.println(this.toString+" : area_cd is null" );
}else{
	System.out.println(this.toString+" : area_cd is "+area_cd );
}
String bo_cd = req.getParameter("bo_cd");
if( bo_cd == null){
	System.out.println(this.toString+" : bo_cd is null" );
}else{
	System.out.println(this.toString+" : bo_cd is "+bo_cd );
}
String bo_seq = req.getParameter("bo_seq");
if( bo_seq == null){
	System.out.println(this.toString+" : bo_seq is null" );
}else{
	System.out.println(this.toString+" : bo_seq is "+bo_seq );
}
String yyyy = req.getParameter("yyyy");
if( yyyy == null){
	System.out.println(this.toString+" : yyyy is null" );
}else{
	System.out.println(this.toString+" : yyyy is "+yyyy );
}
String mode_ar = req.getParameter("mode_ar");
if( mode_ar == null){
	System.out.println(this.toString+" : mode_ar is null" );
}else{
	System.out.println(this.toString+" : mode_ar is "+mode_ar );
}
String trgt_clsf_ar = req.getParameter("trgt_clsf_ar");
if( trgt_clsf_ar == null){
	System.out.println(this.toString+" : trgt_clsf_ar is null" );
}else{
	System.out.println(this.toString+" : trgt_clsf_ar is "+trgt_clsf_ar );
}
String trgt_01_ar = req.getParameter("trgt_01_ar");
if( trgt_01_ar == null){
	System.out.println(this.toString+" : trgt_01_ar is null" );
}else{
	System.out.println(this.toString+" : trgt_01_ar is "+trgt_01_ar );
}
String trgt_02_ar = req.getParameter("trgt_02_ar");
if( trgt_02_ar == null){
	System.out.println(this.toString+" : trgt_02_ar is null" );
}else{
	System.out.println(this.toString+" : trgt_02_ar is "+trgt_02_ar );
}
String trgt_03_ar = req.getParameter("trgt_03_ar");
if( trgt_03_ar == null){
	System.out.println(this.toString+" : trgt_03_ar is null" );
}else{
	System.out.println(this.toString+" : trgt_03_ar is "+trgt_03_ar );
}
String trgt_04_ar = req.getParameter("trgt_04_ar");
if( trgt_04_ar == null){
	System.out.println(this.toString+" : trgt_04_ar is null" );
}else{
	System.out.println(this.toString+" : trgt_04_ar is "+trgt_04_ar );
}
String trgt_05_ar = req.getParameter("trgt_05_ar");
if( trgt_05_ar == null){
	System.out.println(this.toString+" : trgt_05_ar is null" );
}else{
	System.out.println(this.toString+" : trgt_05_ar is "+trgt_05_ar );
}
String trgt_06_ar = req.getParameter("trgt_06_ar");
if( trgt_06_ar == null){
	System.out.println(this.toString+" : trgt_06_ar is null" );
}else{
	System.out.println(this.toString+" : trgt_06_ar is "+trgt_06_ar );
}
String trgt_07_ar = req.getParameter("trgt_07_ar");
if( trgt_07_ar == null){
	System.out.println(this.toString+" : trgt_07_ar is null" );
}else{
	System.out.println(this.toString+" : trgt_07_ar is "+trgt_07_ar );
}
String trgt_08_ar = req.getParameter("trgt_08_ar");
if( trgt_08_ar == null){
	System.out.println(this.toString+" : trgt_08_ar is null" );
}else{
	System.out.println(this.toString+" : trgt_08_ar is "+trgt_08_ar );
}
String trgt_09_ar = req.getParameter("trgt_09_ar");
if( trgt_09_ar == null){
	System.out.println(this.toString+" : trgt_09_ar is null" );
}else{
	System.out.println(this.toString+" : trgt_09_ar is "+trgt_09_ar );
}
String trgt_10_ar = req.getParameter("trgt_10_ar");
if( trgt_10_ar == null){
	System.out.println(this.toString+" : trgt_10_ar is null" );
}else{
	System.out.println(this.toString+" : trgt_10_ar is "+trgt_10_ar );
}
String trgt_11_ar = req.getParameter("trgt_11_ar");
if( trgt_11_ar == null){
	System.out.println(this.toString+" : trgt_11_ar is null" );
}else{
	System.out.println(this.toString+" : trgt_11_ar is "+trgt_11_ar );
}
String trgt_12_ar = req.getParameter("trgt_12_ar");
if( trgt_12_ar == null){
	System.out.println(this.toString+" : trgt_12_ar is null" );
}else{
	System.out.println(this.toString+" : trgt_12_ar is "+trgt_12_ar );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String incmg_pers_ip = req.getParameter("incmg_pers_ip");
if( incmg_pers_ip == null){
	System.out.println(this.toString+" : incmg_pers_ip is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ip is "+incmg_pers_ip );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String busn_dept_yn = Util.checkString(req.getParameter("busn_dept_yn"));
String area_cd = Util.checkString(req.getParameter("area_cd"));
String bo_cd = Util.checkString(req.getParameter("bo_cd"));
String bo_seq = Util.checkString(req.getParameter("bo_seq"));
String yyyy = Util.checkString(req.getParameter("yyyy"));
String mode_ar = Util.checkString(req.getParameter("mode_ar"));
String trgt_clsf_ar = Util.checkString(req.getParameter("trgt_clsf_ar"));
String trgt_01_ar = Util.checkString(req.getParameter("trgt_01_ar"));
String trgt_02_ar = Util.checkString(req.getParameter("trgt_02_ar"));
String trgt_03_ar = Util.checkString(req.getParameter("trgt_03_ar"));
String trgt_04_ar = Util.checkString(req.getParameter("trgt_04_ar"));
String trgt_05_ar = Util.checkString(req.getParameter("trgt_05_ar"));
String trgt_06_ar = Util.checkString(req.getParameter("trgt_06_ar"));
String trgt_07_ar = Util.checkString(req.getParameter("trgt_07_ar"));
String trgt_08_ar = Util.checkString(req.getParameter("trgt_08_ar"));
String trgt_09_ar = Util.checkString(req.getParameter("trgt_09_ar"));
String trgt_10_ar = Util.checkString(req.getParameter("trgt_10_ar"));
String trgt_11_ar = Util.checkString(req.getParameter("trgt_11_ar"));
String trgt_12_ar = Util.checkString(req.getParameter("trgt_12_ar"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String busn_dept_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("busn_dept_yn")));
String area_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("area_cd")));
String bo_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_cd")));
String bo_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_seq")));
String yyyy = Util.Uni2Ksc(Util.checkString(req.getParameter("yyyy")));
String mode_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("mode_ar")));
String trgt_clsf_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("trgt_clsf_ar")));
String trgt_01_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("trgt_01_ar")));
String trgt_02_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("trgt_02_ar")));
String trgt_03_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("trgt_03_ar")));
String trgt_04_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("trgt_04_ar")));
String trgt_05_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("trgt_05_ar")));
String trgt_06_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("trgt_06_ar")));
String trgt_07_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("trgt_07_ar")));
String trgt_08_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("trgt_08_ar")));
String trgt_09_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("trgt_09_ar")));
String trgt_10_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("trgt_10_ar")));
String trgt_11_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("trgt_11_ar")));
String trgt_12_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("trgt_12_ar")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setBusn_dept_yn(busn_dept_yn);
dm.setArea_cd(area_cd);
dm.setBo_cd(bo_cd);
dm.setBo_seq(bo_seq);
dm.setYyyy(yyyy);
dm.setMode_ar(mode_ar);
dm.setTrgt_clsf_ar(trgt_clsf_ar);
dm.setTrgt_01_ar(trgt_01_ar);
dm.setTrgt_02_ar(trgt_02_ar);
dm.setTrgt_03_ar(trgt_03_ar);
dm.setTrgt_04_ar(trgt_04_ar);
dm.setTrgt_05_ar(trgt_05_ar);
dm.setTrgt_06_ar(trgt_06_ar);
dm.setTrgt_07_ar(trgt_07_ar);
dm.setTrgt_08_ar(trgt_08_ar);
dm.setTrgt_09_ar(trgt_09_ar);
dm.setTrgt_10_ar(trgt_10_ar);
dm.setTrgt_11_ar(trgt_11_ar);
dm.setTrgt_12_ar(trgt_12_ar);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ip(incmg_pers_ip);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Mar 26 14:48:44 KST 2009 */