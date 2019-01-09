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


package chosun.ciis.se.boi.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.boi.ds.*;
import chosun.ciis.se.boi.rec.*;

/**
 * 
 */


public class SE_BOI_1220_UDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String chg_gb;
	public String mode_ar;
	public String bo_cd_ar;
	public String zip_ar;
	public String addr_ar;
	public String dtls_addr_ar;
	public String tel_no1_ar;
	public String tel_no2_ar;
	public String tel_no3_ar;
	public String incmg_pers;
	public String incmg_pers_ip;

	public SE_BOI_1220_UDM(){}
	public SE_BOI_1220_UDM(String cmpy_cd, String chg_gb, String mode_ar, String bo_cd_ar, String zip_ar, String addr_ar, String dtls_addr_ar, String tel_no1_ar, String tel_no2_ar, String tel_no3_ar, String incmg_pers, String incmg_pers_ip){
		this.cmpy_cd = cmpy_cd;
		this.chg_gb = chg_gb;
		this.mode_ar = mode_ar;
		this.bo_cd_ar = bo_cd_ar;
		this.zip_ar = zip_ar;
		this.addr_ar = addr_ar;
		this.dtls_addr_ar = dtls_addr_ar;
		this.tel_no1_ar = tel_no1_ar;
		this.tel_no2_ar = tel_no2_ar;
		this.tel_no3_ar = tel_no3_ar;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setChg_gb(String chg_gb){
		this.chg_gb = chg_gb;
	}

	public void setMode_ar(String mode_ar){
		this.mode_ar = mode_ar;
	}

	public void setBo_cd_ar(String bo_cd_ar){
		this.bo_cd_ar = bo_cd_ar;
	}

	public void setZip_ar(String zip_ar){
		this.zip_ar = zip_ar;
	}

	public void setAddr_ar(String addr_ar){
		this.addr_ar = addr_ar;
	}

	public void setDtls_addr_ar(String dtls_addr_ar){
		this.dtls_addr_ar = dtls_addr_ar;
	}

	public void setTel_no1_ar(String tel_no1_ar){
		this.tel_no1_ar = tel_no1_ar;
	}

	public void setTel_no2_ar(String tel_no2_ar){
		this.tel_no2_ar = tel_no2_ar;
	}

	public void setTel_no3_ar(String tel_no3_ar){
		this.tel_no3_ar = tel_no3_ar;
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

	public String getChg_gb(){
		return this.chg_gb;
	}

	public String getMode_ar(){
		return this.mode_ar;
	}

	public String getBo_cd_ar(){
		return this.bo_cd_ar;
	}

	public String getZip_ar(){
		return this.zip_ar;
	}

	public String getAddr_ar(){
		return this.addr_ar;
	}

	public String getDtls_addr_ar(){
		return this.dtls_addr_ar;
	}

	public String getTel_no1_ar(){
		return this.tel_no1_ar;
	}

	public String getTel_no2_ar(){
		return this.tel_no2_ar;
	}

	public String getTel_no3_ar(){
		return this.tel_no3_ar;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getSQL(){
		 return "{ call SP_SE_BOI_1220_U( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_BOI_1220_UDM dm = (SE_BOI_1220_UDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.chg_gb);
		cstmt.setString(5, dm.mode_ar);
		cstmt.setString(6, dm.bo_cd_ar);
		cstmt.setString(7, dm.zip_ar);
		cstmt.setString(8, dm.addr_ar);
		cstmt.setString(9, dm.dtls_addr_ar);
		cstmt.setString(10, dm.tel_no1_ar);
		cstmt.setString(11, dm.tel_no2_ar);
		cstmt.setString(12, dm.tel_no3_ar);
		cstmt.setString(13, dm.incmg_pers);
		cstmt.setString(14, dm.incmg_pers_ip);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.boi.ds.SE_BOI_1220_UDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("chg_gb = " + getChg_gb());
        System.out.println("mode_ar = " + getMode_ar());
        System.out.println("bo_cd_ar = " + getBo_cd_ar());
        System.out.println("zip_ar = " + getZip_ar());
        System.out.println("addr_ar = " + getAddr_ar());
        System.out.println("dtls_addr_ar = " + getDtls_addr_ar());
        System.out.println("tel_no1_ar = " + getTel_no1_ar());
        System.out.println("tel_no2_ar = " + getTel_no2_ar());
        System.out.println("tel_no3_ar = " + getTel_no3_ar());
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
String chg_gb = req.getParameter("chg_gb");
if( chg_gb == null){
	System.out.println(this.toString+" : chg_gb is null" );
}else{
	System.out.println(this.toString+" : chg_gb is "+chg_gb );
}
String mode_ar = req.getParameter("mode_ar");
if( mode_ar == null){
	System.out.println(this.toString+" : mode_ar is null" );
}else{
	System.out.println(this.toString+" : mode_ar is "+mode_ar );
}
String bo_cd_ar = req.getParameter("bo_cd_ar");
if( bo_cd_ar == null){
	System.out.println(this.toString+" : bo_cd_ar is null" );
}else{
	System.out.println(this.toString+" : bo_cd_ar is "+bo_cd_ar );
}
String zip_ar = req.getParameter("zip_ar");
if( zip_ar == null){
	System.out.println(this.toString+" : zip_ar is null" );
}else{
	System.out.println(this.toString+" : zip_ar is "+zip_ar );
}
String addr_ar = req.getParameter("addr_ar");
if( addr_ar == null){
	System.out.println(this.toString+" : addr_ar is null" );
}else{
	System.out.println(this.toString+" : addr_ar is "+addr_ar );
}
String dtls_addr_ar = req.getParameter("dtls_addr_ar");
if( dtls_addr_ar == null){
	System.out.println(this.toString+" : dtls_addr_ar is null" );
}else{
	System.out.println(this.toString+" : dtls_addr_ar is "+dtls_addr_ar );
}
String tel_no1_ar = req.getParameter("tel_no1_ar");
if( tel_no1_ar == null){
	System.out.println(this.toString+" : tel_no1_ar is null" );
}else{
	System.out.println(this.toString+" : tel_no1_ar is "+tel_no1_ar );
}
String tel_no2_ar = req.getParameter("tel_no2_ar");
if( tel_no2_ar == null){
	System.out.println(this.toString+" : tel_no2_ar is null" );
}else{
	System.out.println(this.toString+" : tel_no2_ar is "+tel_no2_ar );
}
String tel_no3_ar = req.getParameter("tel_no3_ar");
if( tel_no3_ar == null){
	System.out.println(this.toString+" : tel_no3_ar is null" );
}else{
	System.out.println(this.toString+" : tel_no3_ar is "+tel_no3_ar );
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
String chg_gb = Util.checkString(req.getParameter("chg_gb"));
String mode_ar = Util.checkString(req.getParameter("mode_ar"));
String bo_cd_ar = Util.checkString(req.getParameter("bo_cd_ar"));
String zip_ar = Util.checkString(req.getParameter("zip_ar"));
String addr_ar = Util.checkString(req.getParameter("addr_ar"));
String dtls_addr_ar = Util.checkString(req.getParameter("dtls_addr_ar"));
String tel_no1_ar = Util.checkString(req.getParameter("tel_no1_ar"));
String tel_no2_ar = Util.checkString(req.getParameter("tel_no2_ar"));
String tel_no3_ar = Util.checkString(req.getParameter("tel_no3_ar"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String chg_gb = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_gb")));
String mode_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("mode_ar")));
String bo_cd_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_cd_ar")));
String zip_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("zip_ar")));
String addr_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("addr_ar")));
String dtls_addr_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("dtls_addr_ar")));
String tel_no1_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("tel_no1_ar")));
String tel_no2_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("tel_no2_ar")));
String tel_no3_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("tel_no3_ar")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setChg_gb(chg_gb);
dm.setMode_ar(mode_ar);
dm.setBo_cd_ar(bo_cd_ar);
dm.setZip_ar(zip_ar);
dm.setAddr_ar(addr_ar);
dm.setDtls_addr_ar(dtls_addr_ar);
dm.setTel_no1_ar(tel_no1_ar);
dm.setTel_no2_ar(tel_no2_ar);
dm.setTel_no3_ar(tel_no3_ar);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ip(incmg_pers_ip);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Feb 02 11:53:40 KST 2009 */