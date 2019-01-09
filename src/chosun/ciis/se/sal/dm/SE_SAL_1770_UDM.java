/***************************************************************************************************
* 파일명 : SE_SAL_1770_UDM.java
* 기능 : 판매 - 지대관리 - 매출관리 - 계산서 발행
* 작성일자 : 2009-04-22
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.sal.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.sal.ds.*;
import chosun.ciis.se.sal.rec.*;

/**
 * 
 */


public class SE_SAL_1770_UDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd		;
	public String slip_occr_dt	;
	public String slip_clsf_cd	;
	public String slip_seq		;
	public String vat_gubun		;
	public String semuro_no		;
	public String incmg_pers_ip ;
	public String incmg_pers	;

	public SE_SAL_1770_UDM(){}
	public SE_SAL_1770_UDM(String cmpy_cd, String slip_occr_dt, String slip_clsf_cd, String slip_seq, String vat_gubun, String semuro_no, String incmg_pers_ip, String incmg_pers){
		this.cmpy_cd 		= cmpy_cd		;
		this.slip_occr_dt 	= slip_occr_dt	;
		this.slip_clsf_cd 	= slip_clsf_cd	;
		this.slip_seq 		= slip_seq		;
		this.vat_gubun 		= vat_gubun		;
		this.semuro_no 		= semuro_no		;
		this.incmg_pers_ip	= incmg_pers_ip	;
		this.incmg_pers		= incmg_pers	;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSlip_occr_dt(String slip_occr_dt){
		this.slip_occr_dt = slip_occr_dt;
	}

	public void setSlip_clsf_cd(String slip_clsf_cd){
		this.slip_clsf_cd = slip_clsf_cd;
	}

	public void setSlip_seq(String slip_seq){
		this.slip_seq = slip_seq;
	}

	public void setVat_gubun(String vat_gubun){
		this.vat_gubun = vat_gubun;
	}

	public void setSemuro_no(String semuro_no){
		this.semuro_no = semuro_no;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSlip_occr_dt(){
		return this.slip_occr_dt;
	}

	public String getSlip_clsf_cd(){
		return this.slip_clsf_cd;
	}

	public String getSlip_seq(){
		return this.slip_seq;
	}

	public String getVat_gubun(){
		return this.vat_gubun;
	}

	public String getSemuro_no(){
		return this.semuro_no;
	}

	public String getSQL(){
		 return "{ call SP_SE_SAL_1770_U( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_SAL_1770_UDM dm = (SE_SAL_1770_UDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd		);
		cstmt.setString(4, dm.slip_occr_dt	);
		cstmt.setString(5, dm.slip_clsf_cd	);
		cstmt.setString(6, dm.slip_seq		);
		cstmt.setString(7, dm.vat_gubun		);
		cstmt.setString(8, dm.semuro_no		);
		cstmt.setString(9, dm.incmg_pers_ip	);
		cstmt.setString(10, dm.incmg_pers	);
				
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.sal.ds.SE_SAL_1770_UDataSet();
	}

	public void print(){
        System.out.println("cmpy_cd 		= " + getCmpy_cd		());
        System.out.println("slip_occr_dt 	= " + getSlip_occr_dt	());
        System.out.println("slip_clsf_cd 	= " + getSlip_clsf_cd	());
        System.out.println("slip_seq 		= " + getSlip_seq		());
        System.out.println("vat_gubun 		= " + getVat_gubun		());
        System.out.println("semuro_no 		= " + getSemuro_no		());
        System.out.println("incmg_pers_ip	= " + getIncmg_pers_ip	());
        System.out.println("incmg_pers 		= " + getIncmg_pers		());
    }
	public String getIncmg_pers() {
		return incmg_pers;
	}
	public void setIncmg_pers(String incmg_pers) {
		this.incmg_pers = incmg_pers;
	}
	public String getIncmg_pers_ip() {
		return incmg_pers_ip;
	}
	public void setIncmg_pers_ip(String incmg_pers_ip) {
		this.incmg_pers_ip = incmg_pers_ip;
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
String slip_occr_dt = req.getParameter("slip_occr_dt");
if( slip_occr_dt == null){
	System.out.println(this.toString+" : slip_occr_dt is null" );
}else{
	System.out.println(this.toString+" : slip_occr_dt is "+slip_occr_dt );
}
String slip_clsf_cd = req.getParameter("slip_clsf_cd");
if( slip_clsf_cd == null){
	System.out.println(this.toString+" : slip_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : slip_clsf_cd is "+slip_clsf_cd );
}
String slip_seq = req.getParameter("slip_seq");
if( slip_seq == null){
	System.out.println(this.toString+" : slip_seq is null" );
}else{
	System.out.println(this.toString+" : slip_seq is "+slip_seq );
}
String vat_gubun = req.getParameter("vat_gubun");
if( vat_gubun == null){
	System.out.println(this.toString+" : vat_gubun is null" );
}else{
	System.out.println(this.toString+" : vat_gubun is "+vat_gubun );
}
String semuro_no = req.getParameter("semuro_no");
if( semuro_no == null){
	System.out.println(this.toString+" : semuro_no is null" );
}else{
	System.out.println(this.toString+" : semuro_no is "+semuro_no );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
String slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
String slip_seq = Util.checkString(req.getParameter("slip_seq"));
String vat_gubun = Util.checkString(req.getParameter("vat_gubun"));
String semuro_no = Util.checkString(req.getParameter("semuro_no"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String slip_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_occr_dt")));
String slip_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf_cd")));
String slip_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_seq")));
String vat_gubun = Util.Uni2Ksc(Util.checkString(req.getParameter("vat_gubun")));
String semuro_no = Util.Uni2Ksc(Util.checkString(req.getParameter("semuro_no")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setSlip_occr_dt(slip_occr_dt);
dm.setSlip_clsf_cd(slip_clsf_cd);
dm.setSlip_seq(slip_seq);
dm.setVat_gubun(vat_gubun);
dm.setSemuro_no(semuro_no);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Apr 22 18:19:40 KST 2009 */