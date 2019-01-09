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


public class SE_BOI_1070_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String accflag;
	public String cmpy_cd;
	public String bo_head_nm;
	public String bo_head_prn;
	public String tel_no_0;
	public String tel_no_1;
	public String tel_no_2;
	public String tel_no_3;
	public String ptph_1;
	public String ptph_2;
	public String ptph_3;
	public String bo_head_bidt;
	public String luso_clsf;
	public String wedd_anvy_dd;
	public String zip_1;
	public String zip_2;
	public String addr;
	public String dtls_addr;
	public String nativ;
	public String hby;
	public String relg;
	public String drink_qunt;
	public String smok_yn;
	public String dlco_no;
	public byte[] bo_head_phot;
	public String phot_size;
	public String mode_ar;
	public String hsty_seq_ar;
	public String yymm_ar;
	public String hsty_matt_ar;
	public String mode2_ar;
	public String faml_seq_ar;
	public String flnm_ar;
	public String faml_rshp_cd_ar;
	public String bidt_ar;
	public String luso_clsf_ar;
	public String mode3_ar;
	public String idea_seq_ar;
	public String make_pers_nm_ar;
	public String idea_ar;
	public String incmgpers;
	public String incmg_pers_ip;

	public SE_BOI_1070_ADM(){}
	public SE_BOI_1070_ADM(String accflag, String cmpy_cd, String bo_head_nm, String bo_head_prn, String tel_no_0, String tel_no_1, String tel_no_2, String tel_no_3, String ptph_1, String ptph_2, String ptph_3, String bo_head_bidt, String luso_clsf, String wedd_anvy_dd, String zip_1, String zip_2, String addr, String dtls_addr, String nativ, String hby, String relg, String drink_qunt, String smok_yn, String dlco_no, byte[] bo_head_phot, String phot_size, String mode_ar, String hsty_seq_ar, String yymm_ar, String hsty_matt_ar, String mode2_ar, String faml_seq_ar, String flnm_ar, String faml_rshp_cd_ar, String bidt_ar, String luso_clsf_ar, String mode3_ar, String idea_seq_ar, String make_pers_nm_ar, String idea_ar, String incmgpers, String incmg_pers_ip){
		this.accflag = accflag;
		this.cmpy_cd = cmpy_cd;
		this.bo_head_nm = bo_head_nm;
		this.bo_head_prn = bo_head_prn;
		this.tel_no_0 = tel_no_0;
		this.tel_no_1 = tel_no_1;
		this.tel_no_2 = tel_no_2;
		this.tel_no_3 = tel_no_3;
		this.ptph_1 = ptph_1;
		this.ptph_2 = ptph_2;
		this.ptph_3 = ptph_3;
		this.bo_head_bidt = bo_head_bidt;
		this.luso_clsf = luso_clsf;
		this.wedd_anvy_dd = wedd_anvy_dd;
		this.zip_1 = zip_1;
		this.zip_2 = zip_2;
		this.addr = addr;
		this.dtls_addr = dtls_addr;
		this.nativ = nativ;
		this.hby = hby;
		this.relg = relg;
		this.drink_qunt = drink_qunt;
		this.smok_yn = smok_yn;
		this.dlco_no = dlco_no;
		this.bo_head_phot = bo_head_phot;
		this.phot_size = phot_size;
		this.mode_ar = mode_ar;
		this.hsty_seq_ar = hsty_seq_ar;
		this.yymm_ar = yymm_ar;
		this.hsty_matt_ar = hsty_matt_ar;
		this.mode2_ar = mode2_ar;
		this.faml_seq_ar = faml_seq_ar;
		this.flnm_ar = flnm_ar;
		this.faml_rshp_cd_ar = faml_rshp_cd_ar;
		this.bidt_ar = bidt_ar;
		this.luso_clsf_ar = luso_clsf_ar;
		this.mode3_ar = mode3_ar;
		this.idea_seq_ar = idea_seq_ar;
		this.make_pers_nm_ar = make_pers_nm_ar;
		this.idea_ar = idea_ar;
		this.incmgpers = incmgpers;
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setAccflag(String accflag){
		this.accflag = accflag;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setBo_head_nm(String bo_head_nm){
		this.bo_head_nm = bo_head_nm;
	}

	public void setBo_head_prn(String bo_head_prn){
		this.bo_head_prn = bo_head_prn;
	}

	public void setTel_no_0(String tel_no_0){
		this.tel_no_0 = tel_no_0;
	}

	public void setTel_no_1(String tel_no_1){
		this.tel_no_1 = tel_no_1;
	}

	public void setTel_no_2(String tel_no_2){
		this.tel_no_2 = tel_no_2;
	}

	public void setTel_no_3(String tel_no_3){
		this.tel_no_3 = tel_no_3;
	}

	public void setPtph_1(String ptph_1){
		this.ptph_1 = ptph_1;
	}

	public void setPtph_2(String ptph_2){
		this.ptph_2 = ptph_2;
	}

	public void setPtph_3(String ptph_3){
		this.ptph_3 = ptph_3;
	}

	public void setBo_head_bidt(String bo_head_bidt){
		this.bo_head_bidt = bo_head_bidt;
	}

	public void setLuso_clsf(String luso_clsf){
		this.luso_clsf = luso_clsf;
	}

	public void setWedd_anvy_dd(String wedd_anvy_dd){
		this.wedd_anvy_dd = wedd_anvy_dd;
	}

	public void setZip_1(String zip_1){
		this.zip_1 = zip_1;
	}

	public void setZip_2(String zip_2){
		this.zip_2 = zip_2;
	}

	public void setAddr(String addr){
		this.addr = addr;
	}

	public void setDtls_addr(String dtls_addr){
		this.dtls_addr = dtls_addr;
	}

	public void setNativ(String nativ){
		this.nativ = nativ;
	}

	public void setHby(String hby){
		this.hby = hby;
	}

	public void setRelg(String relg){
		this.relg = relg;
	}

	public void setDrink_qunt(String drink_qunt){
		this.drink_qunt = drink_qunt;
	}

	public void setSmok_yn(String smok_yn){
		this.smok_yn = smok_yn;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}
	
	public void setBo_head_phot(byte[] bo_head_phot){
		this.bo_head_phot = bo_head_phot;
	}

	public void setPhot_size(String i){
		this.phot_size = i;
	}

	public void setMode_ar(String mode_ar){
		this.mode_ar = mode_ar;
	}

	public void setHsty_seq_ar(String hsty_seq_ar){
		this.hsty_seq_ar = hsty_seq_ar;
	}

	public void setYymm_ar(String yymm_ar){
		this.yymm_ar = yymm_ar;
	}

	public void setHsty_matt_ar(String hsty_matt_ar){
		this.hsty_matt_ar = hsty_matt_ar;
	}

	public void setMode2_ar(String mode2_ar){
		this.mode2_ar = mode2_ar;
	}

	public void setFaml_seq_ar(String faml_seq_ar){
		this.faml_seq_ar = faml_seq_ar;
	}

	public void setFlnm_ar(String flnm_ar){
		this.flnm_ar = flnm_ar;
	}

	public void setFaml_rshp_cd_ar(String faml_rshp_cd_ar){
		this.faml_rshp_cd_ar = faml_rshp_cd_ar;
	}

	public void setBidt_ar(String bidt_ar){
		this.bidt_ar = bidt_ar;
	}

	public void setLuso_clsf_ar(String luso_clsf_ar){
		this.luso_clsf_ar = luso_clsf_ar;
	}

	public void setMode3_ar(String mode3_ar){
		this.mode3_ar = mode3_ar;
	}

	public void setIdea_seq_ar(String idea_seq_ar){
		this.idea_seq_ar = idea_seq_ar;
	}

	public void setMake_pers_nm_ar(String make_pers_nm_ar){
		this.make_pers_nm_ar = make_pers_nm_ar;
	}

	public void setIdea_ar(String idea_ar){
		this.idea_ar = idea_ar;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public String getAccflag(){
		return this.accflag;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getBo_head_nm(){
		return this.bo_head_nm;
	}

	public String getBo_head_prn(){
		return this.bo_head_prn;
	}

	public String getTel_no_0(){
		return this.tel_no_0;
	}

	public String getTel_no_1(){
		return this.tel_no_1;
	}

	public String getTel_no_2(){
		return this.tel_no_2;
	}

	public String getTel_no_3(){
		return this.tel_no_3;
	}

	public String getPtph_1(){
		return this.ptph_1;
	}

	public String getPtph_2(){
		return this.ptph_2;
	}

	public String getPtph_3(){
		return this.ptph_3;
	}

	public String getBo_head_bidt(){
		return this.bo_head_bidt;
	}

	public String getLuso_clsf(){
		return this.luso_clsf;
	}

	public String getWedd_anvy_dd(){
		return this.wedd_anvy_dd;
	}

	public String getZip_1(){
		return this.zip_1;
	}

	public String getZip_2(){
		return this.zip_2;
	}

	public String getAddr(){
		return this.addr;
	}

	public String getDtls_addr(){
		return this.dtls_addr;
	}

	public String getNativ(){
		return this.nativ;
	}

	public String getHby(){
		return this.hby;
	}

	public String getRelg(){
		return this.relg;
	}

	public String getDrink_qunt(){
		return this.drink_qunt;
	}

	public String getSmok_yn(){
		return this.smok_yn;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}
	
	public byte[] getBo_head_phot(){
		return this.bo_head_phot;
	}

	public String getPhot_size(){
		return this.phot_size;
	}

	public String getMode_ar(){
		return this.mode_ar;
	}

	public String getHsty_seq_ar(){
		return this.hsty_seq_ar;
	}

	public String getYymm_ar(){
		return this.yymm_ar;
	}

	public String getHsty_matt_ar(){
		return this.hsty_matt_ar;
	}

	public String getMode2_ar(){
		return this.mode2_ar;
	}

	public String getFaml_seq_ar(){
		return this.faml_seq_ar;
	}

	public String getFlnm_ar(){
		return this.flnm_ar;
	}

	public String getFaml_rshp_cd_ar(){
		return this.faml_rshp_cd_ar;
	}

	public String getBidt_ar(){
		return this.bidt_ar;
	}

	public String getLuso_clsf_ar(){
		return this.luso_clsf_ar;
	}

	public String getMode3_ar(){
		return this.mode3_ar;
	}

	public String getIdea_seq_ar(){
		return this.idea_seq_ar;
	}

	public String getMake_pers_nm_ar(){
		return this.make_pers_nm_ar;
	}

	public String getIdea_ar(){
		return this.idea_ar;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getSQL(){
		 return "{ call SP_SE_BOI_1070_A( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_BOI_1070_ADM dm = (SE_BOI_1070_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.accflag);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.bo_head_nm);
		cstmt.setString(6, dm.bo_head_prn);
		cstmt.setString(7, dm.tel_no_0);
		cstmt.setString(8, dm.tel_no_1);
		cstmt.setString(9, dm.tel_no_2);
		cstmt.setString(10, dm.tel_no_3);
		cstmt.setString(11, dm.ptph_1);
		cstmt.setString(12, dm.ptph_2);
		cstmt.setString(13, dm.ptph_3);
		cstmt.setString(14, dm.bo_head_bidt);
		cstmt.setString(15, dm.luso_clsf);
		cstmt.setString(16, dm.wedd_anvy_dd);
		cstmt.setString(17, dm.zip_1);
		cstmt.setString(18, dm.zip_2);
		cstmt.setString(19, dm.addr);
		cstmt.setString(20, dm.dtls_addr);
		cstmt.setString(21, dm.nativ);
		cstmt.setString(22, dm.hby);
		cstmt.setString(23, dm.relg);
		cstmt.setString(24, dm.drink_qunt);
		cstmt.setString(25, dm.smok_yn);
		cstmt.setString(26, dm.dlco_no);
		cstmt.setBytes(27, dm.bo_head_phot);
		//cstmt.setBytes(27, "1010".getBytes());
		cstmt.setString(28, dm.phot_size);
		cstmt.setString(29, dm.mode_ar);
		cstmt.setString(30, dm.hsty_seq_ar);
		cstmt.setString(31, dm.yymm_ar);
		cstmt.setString(32, dm.hsty_matt_ar);
		cstmt.setString(33, dm.mode2_ar);
		cstmt.setString(34, dm.faml_seq_ar);
		cstmt.setString(35, dm.flnm_ar);
		cstmt.setString(36, dm.faml_rshp_cd_ar);
		cstmt.setString(37, dm.bidt_ar);
		cstmt.setString(38, dm.luso_clsf_ar);
		cstmt.setString(39, dm.mode3_ar);
		cstmt.setString(40, dm.idea_seq_ar);
		cstmt.setString(41, dm.make_pers_nm_ar);
		cstmt.setString(42, dm.idea_ar);
		cstmt.setString(43, dm.incmgpers);
		cstmt.setString(44, dm.incmg_pers_ip);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.boi.ds.SE_BOI_1070_ADataSet();
	}



    public void print(){
        System.out.println("accflag = " + getAccflag());
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("bo_head_nm = " + getBo_head_nm());
        System.out.println("bo_head_prn = " + getBo_head_prn());
        System.out.println("tel_no_0 = " + getTel_no_0());
        System.out.println("tel_no_1 = " + getTel_no_1());
        System.out.println("tel_no_2 = " + getTel_no_2());
        System.out.println("tel_no_3 = " + getTel_no_3());
        System.out.println("ptph_1 = " + getPtph_1());
        System.out.println("ptph_2 = " + getPtph_2());
        System.out.println("ptph_3 = " + getPtph_3());
        System.out.println("bo_head_bidt = " + getBo_head_bidt());
        System.out.println("luso_clsf = " + getLuso_clsf());
        System.out.println("wedd_anvy_dd = " + getWedd_anvy_dd());
        System.out.println("zip_1 = " + getZip_1());
        System.out.println("zip_2 = " + getZip_2());
        System.out.println("addr = " + getAddr());
        System.out.println("dtls_addr = " + getDtls_addr());
        System.out.println("bo_head_phot = " + getBo_head_phot());
        System.out.println("phot_size = " + getPhot_size());
        System.out.println("mode_ar = " + getMode_ar());
        System.out.println("hsty_seq_ar = " + getHsty_seq_ar());
        System.out.println("yymm_ar = " + getYymm_ar());
        System.out.println("hsty_matt_ar = " + getHsty_matt_ar());
        System.out.println("mode2_ar = " + getMode2_ar());
        System.out.println("faml_seq_ar = " + getFaml_seq_ar());
        System.out.println("flnm_ar = " + getFlnm_ar());
        System.out.println("faml_rshp_cd_ar = " + getFaml_rshp_cd_ar());
        System.out.println("bidt_ar = " + getBidt_ar());
        System.out.println("luso_clsf_ar = " + getLuso_clsf_ar());
        System.out.println("mode3_ar = " + getMode3_ar());
        System.out.println("idea_seq_ar = " + getIdea_seq_ar());
        System.out.println("make_pers_nm_ar = " + getMake_pers_nm_ar());
        System.out.println("idea_ar = " + getIdea_ar());
        System.out.println("incmgpers = " + getIncmgpers());
        System.out.println("incmg_pers_ip = " + getIncmg_pers_ip());
    }
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String accflag = req.getParameter("accflag");
if( accflag == null){
	System.out.println(this.toString+" : accflag is null" );
}else{
	System.out.println(this.toString+" : accflag is "+accflag );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String bo_head_nm = req.getParameter("bo_head_nm");
if( bo_head_nm == null){
	System.out.println(this.toString+" : bo_head_nm is null" );
}else{
	System.out.println(this.toString+" : bo_head_nm is "+bo_head_nm );
}
String bo_head_prn = req.getParameter("bo_head_prn");
if( bo_head_prn == null){
	System.out.println(this.toString+" : bo_head_prn is null" );
}else{
	System.out.println(this.toString+" : bo_head_prn is "+bo_head_prn );
}
String tel_no_0 = req.getParameter("tel_no_0");
if( tel_no_0 == null){
	System.out.println(this.toString+" : tel_no_0 is null" );
}else{
	System.out.println(this.toString+" : tel_no_0 is "+tel_no_0 );
}
String tel_no_1 = req.getParameter("tel_no_1");
if( tel_no_1 == null){
	System.out.println(this.toString+" : tel_no_1 is null" );
}else{
	System.out.println(this.toString+" : tel_no_1 is "+tel_no_1 );
}
String tel_no_2 = req.getParameter("tel_no_2");
if( tel_no_2 == null){
	System.out.println(this.toString+" : tel_no_2 is null" );
}else{
	System.out.println(this.toString+" : tel_no_2 is "+tel_no_2 );
}
String tel_no_3 = req.getParameter("tel_no_3");
if( tel_no_3 == null){
	System.out.println(this.toString+" : tel_no_3 is null" );
}else{
	System.out.println(this.toString+" : tel_no_3 is "+tel_no_3 );
}
String ptph_1 = req.getParameter("ptph_1");
if( ptph_1 == null){
	System.out.println(this.toString+" : ptph_1 is null" );
}else{
	System.out.println(this.toString+" : ptph_1 is "+ptph_1 );
}
String ptph_2 = req.getParameter("ptph_2");
if( ptph_2 == null){
	System.out.println(this.toString+" : ptph_2 is null" );
}else{
	System.out.println(this.toString+" : ptph_2 is "+ptph_2 );
}
String ptph_3 = req.getParameter("ptph_3");
if( ptph_3 == null){
	System.out.println(this.toString+" : ptph_3 is null" );
}else{
	System.out.println(this.toString+" : ptph_3 is "+ptph_3 );
}
String bo_head_bidt = req.getParameter("bo_head_bidt");
if( bo_head_bidt == null){
	System.out.println(this.toString+" : bo_head_bidt is null" );
}else{
	System.out.println(this.toString+" : bo_head_bidt is "+bo_head_bidt );
}
String luso_clsf = req.getParameter("luso_clsf");
if( luso_clsf == null){
	System.out.println(this.toString+" : luso_clsf is null" );
}else{
	System.out.println(this.toString+" : luso_clsf is "+luso_clsf );
}
String wedd_anvy_dd = req.getParameter("wedd_anvy_dd");
if( wedd_anvy_dd == null){
	System.out.println(this.toString+" : wedd_anvy_dd is null" );
}else{
	System.out.println(this.toString+" : wedd_anvy_dd is "+wedd_anvy_dd );
}
String zip_1 = req.getParameter("zip_1");
if( zip_1 == null){
	System.out.println(this.toString+" : zip_1 is null" );
}else{
	System.out.println(this.toString+" : zip_1 is "+zip_1 );
}
String zip_2 = req.getParameter("zip_2");
if( zip_2 == null){
	System.out.println(this.toString+" : zip_2 is null" );
}else{
	System.out.println(this.toString+" : zip_2 is "+zip_2 );
}
String addr = req.getParameter("addr");
if( addr == null){
	System.out.println(this.toString+" : addr is null" );
}else{
	System.out.println(this.toString+" : addr is "+addr );
}
String dtls_addr = req.getParameter("dtls_addr");
if( dtls_addr == null){
	System.out.println(this.toString+" : dtls_addr is null" );
}else{
	System.out.println(this.toString+" : dtls_addr is "+dtls_addr );
}
String bo_head_phot = req.getParameter("bo_head_phot");
if( bo_head_phot == null){
	System.out.println(this.toString+" : bo_head_phot is null" );
}else{
	System.out.println(this.toString+" : bo_head_phot is "+bo_head_phot );
}
String phot_size = req.getParameter("phot_size");
if( phot_size == null){
	System.out.println(this.toString+" : phot_size is null" );
}else{
	System.out.println(this.toString+" : phot_size is "+phot_size );
}
String mode_ar = req.getParameter("mode_ar");
if( mode_ar == null){
	System.out.println(this.toString+" : mode_ar is null" );
}else{
	System.out.println(this.toString+" : mode_ar is "+mode_ar );
}
String hsty_seq_ar = req.getParameter("hsty_seq_ar");
if( hsty_seq_ar == null){
	System.out.println(this.toString+" : hsty_seq_ar is null" );
}else{
	System.out.println(this.toString+" : hsty_seq_ar is "+hsty_seq_ar );
}
String yymm_ar = req.getParameter("yymm_ar");
if( yymm_ar == null){
	System.out.println(this.toString+" : yymm_ar is null" );
}else{
	System.out.println(this.toString+" : yymm_ar is "+yymm_ar );
}
String hsty_matt_ar = req.getParameter("hsty_matt_ar");
if( hsty_matt_ar == null){
	System.out.println(this.toString+" : hsty_matt_ar is null" );
}else{
	System.out.println(this.toString+" : hsty_matt_ar is "+hsty_matt_ar );
}
String mode2_ar = req.getParameter("mode2_ar");
if( mode2_ar == null){
	System.out.println(this.toString+" : mode2_ar is null" );
}else{
	System.out.println(this.toString+" : mode2_ar is "+mode2_ar );
}
String faml_seq_ar = req.getParameter("faml_seq_ar");
if( faml_seq_ar == null){
	System.out.println(this.toString+" : faml_seq_ar is null" );
}else{
	System.out.println(this.toString+" : faml_seq_ar is "+faml_seq_ar );
}
String flnm_ar = req.getParameter("flnm_ar");
if( flnm_ar == null){
	System.out.println(this.toString+" : flnm_ar is null" );
}else{
	System.out.println(this.toString+" : flnm_ar is "+flnm_ar );
}
String faml_rshp_cd_ar = req.getParameter("faml_rshp_cd_ar");
if( faml_rshp_cd_ar == null){
	System.out.println(this.toString+" : faml_rshp_cd_ar is null" );
}else{
	System.out.println(this.toString+" : faml_rshp_cd_ar is "+faml_rshp_cd_ar );
}
String bidt_ar = req.getParameter("bidt_ar");
if( bidt_ar == null){
	System.out.println(this.toString+" : bidt_ar is null" );
}else{
	System.out.println(this.toString+" : bidt_ar is "+bidt_ar );
}
String luso_clsf_ar = req.getParameter("luso_clsf_ar");
if( luso_clsf_ar == null){
	System.out.println(this.toString+" : luso_clsf_ar is null" );
}else{
	System.out.println(this.toString+" : luso_clsf_ar is "+luso_clsf_ar );
}
String mode3_ar = req.getParameter("mode3_ar");
if( mode3_ar == null){
	System.out.println(this.toString+" : mode3_ar is null" );
}else{
	System.out.println(this.toString+" : mode3_ar is "+mode3_ar );
}
String idea_seq_ar = req.getParameter("idea_seq_ar");
if( idea_seq_ar == null){
	System.out.println(this.toString+" : idea_seq_ar is null" );
}else{
	System.out.println(this.toString+" : idea_seq_ar is "+idea_seq_ar );
}
String make_pers_nm_ar = req.getParameter("make_pers_nm_ar");
if( make_pers_nm_ar == null){
	System.out.println(this.toString+" : make_pers_nm_ar is null" );
}else{
	System.out.println(this.toString+" : make_pers_nm_ar is "+make_pers_nm_ar );
}
String idea_ar = req.getParameter("idea_ar");
if( idea_ar == null){
	System.out.println(this.toString+" : idea_ar is null" );
}else{
	System.out.println(this.toString+" : idea_ar is "+idea_ar );
}
String incmgpers = req.getParameter("incmgpers");
if( incmgpers == null){
	System.out.println(this.toString+" : incmgpers is null" );
}else{
	System.out.println(this.toString+" : incmgpers is "+incmgpers );
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

String accflag = Util.checkString(req.getParameter("accflag"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String bo_head_nm = Util.checkString(req.getParameter("bo_head_nm"));
String bo_head_prn = Util.checkString(req.getParameter("bo_head_prn"));
String tel_no_0 = Util.checkString(req.getParameter("tel_no_0"));
String tel_no_1 = Util.checkString(req.getParameter("tel_no_1"));
String tel_no_2 = Util.checkString(req.getParameter("tel_no_2"));
String tel_no_3 = Util.checkString(req.getParameter("tel_no_3"));
String ptph_1 = Util.checkString(req.getParameter("ptph_1"));
String ptph_2 = Util.checkString(req.getParameter("ptph_2"));
String ptph_3 = Util.checkString(req.getParameter("ptph_3"));
String bo_head_bidt = Util.checkString(req.getParameter("bo_head_bidt"));
String luso_clsf = Util.checkString(req.getParameter("luso_clsf"));
String wedd_anvy_dd = Util.checkString(req.getParameter("wedd_anvy_dd"));
String zip_1 = Util.checkString(req.getParameter("zip_1"));
String zip_2 = Util.checkString(req.getParameter("zip_2"));
String addr = Util.checkString(req.getParameter("addr"));
String dtls_addr = Util.checkString(req.getParameter("dtls_addr"));
String bo_head_phot = Util.checkString(req.getParameter("bo_head_phot"));
String phot_size = Util.checkString(req.getParameter("phot_size"));
String mode_ar = Util.checkString(req.getParameter("mode_ar"));
String hsty_seq_ar = Util.checkString(req.getParameter("hsty_seq_ar"));
String yymm_ar = Util.checkString(req.getParameter("yymm_ar"));
String hsty_matt_ar = Util.checkString(req.getParameter("hsty_matt_ar"));
String mode2_ar = Util.checkString(req.getParameter("mode2_ar"));
String faml_seq_ar = Util.checkString(req.getParameter("faml_seq_ar"));
String flnm_ar = Util.checkString(req.getParameter("flnm_ar"));
String faml_rshp_cd_ar = Util.checkString(req.getParameter("faml_rshp_cd_ar"));
String bidt_ar = Util.checkString(req.getParameter("bidt_ar"));
String luso_clsf_ar = Util.checkString(req.getParameter("luso_clsf_ar"));
String mode3_ar = Util.checkString(req.getParameter("mode3_ar"));
String idea_seq_ar = Util.checkString(req.getParameter("idea_seq_ar"));
String make_pers_nm_ar = Util.checkString(req.getParameter("make_pers_nm_ar"));
String idea_ar = Util.checkString(req.getParameter("idea_ar"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String accflag = Util.Uni2Ksc(Util.checkString(req.getParameter("accflag")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String bo_head_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_head_nm")));
String bo_head_prn = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_head_prn")));
String tel_no_0 = Util.Uni2Ksc(Util.checkString(req.getParameter("tel_no_0")));
String tel_no_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("tel_no_1")));
String tel_no_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("tel_no_2")));
String tel_no_3 = Util.Uni2Ksc(Util.checkString(req.getParameter("tel_no_3")));
String ptph_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("ptph_1")));
String ptph_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("ptph_2")));
String ptph_3 = Util.Uni2Ksc(Util.checkString(req.getParameter("ptph_3")));
String bo_head_bidt = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_head_bidt")));
String luso_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("luso_clsf")));
String wedd_anvy_dd = Util.Uni2Ksc(Util.checkString(req.getParameter("wedd_anvy_dd")));
String zip_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("zip_1")));
String zip_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("zip_2")));
String addr = Util.Uni2Ksc(Util.checkString(req.getParameter("addr")));
String dtls_addr = Util.Uni2Ksc(Util.checkString(req.getParameter("dtls_addr")));
String bo_head_phot = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_head_phot")));
String phot_size = Util.Uni2Ksc(Util.checkString(req.getParameter("phot_size")));
String mode_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("mode_ar")));
String hsty_seq_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("hsty_seq_ar")));
String yymm_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("yymm_ar")));
String hsty_matt_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("hsty_matt_ar")));
String mode2_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("mode2_ar")));
String faml_seq_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("faml_seq_ar")));
String flnm_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("flnm_ar")));
String faml_rshp_cd_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("faml_rshp_cd_ar")));
String bidt_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("bidt_ar")));
String luso_clsf_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("luso_clsf_ar")));
String mode3_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("mode3_ar")));
String idea_seq_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("idea_seq_ar")));
String make_pers_nm_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("make_pers_nm_ar")));
String idea_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("idea_ar")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setAccflag(accflag);
dm.setCmpy_cd(cmpy_cd);
dm.setBo_head_nm(bo_head_nm);
dm.setBo_head_prn(bo_head_prn);
dm.setTel_no_0(tel_no_0);
dm.setTel_no_1(tel_no_1);
dm.setTel_no_2(tel_no_2);
dm.setTel_no_3(tel_no_3);
dm.setPtph_1(ptph_1);
dm.setPtph_2(ptph_2);
dm.setPtph_3(ptph_3);
dm.setBo_head_bidt(bo_head_bidt);
dm.setLuso_clsf(luso_clsf);
dm.setWedd_anvy_dd(wedd_anvy_dd);
dm.setZip_1(zip_1);
dm.setZip_2(zip_2);
dm.setAddr(addr);
dm.setDtls_addr(dtls_addr);
dm.setBo_head_phot(bo_head_phot);
dm.setPhot_size(phot_size);
dm.setMode_ar(mode_ar);
dm.setHsty_seq_ar(hsty_seq_ar);
dm.setYymm_ar(yymm_ar);
dm.setHsty_matt_ar(hsty_matt_ar);
dm.setMode2_ar(mode2_ar);
dm.setFaml_seq_ar(faml_seq_ar);
dm.setFlnm_ar(flnm_ar);
dm.setFaml_rshp_cd_ar(faml_rshp_cd_ar);
dm.setBidt_ar(bidt_ar);
dm.setLuso_clsf_ar(luso_clsf_ar);
dm.setMode3_ar(mode3_ar);
dm.setIdea_seq_ar(idea_seq_ar);
dm.setMake_pers_nm_ar(make_pers_nm_ar);
dm.setIdea_ar(idea_ar);
dm.setIncmgpers(incmgpers);
dm.setIncmg_pers_ip(incmg_pers_ip);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jan 20 18:12:58 KST 2009 */