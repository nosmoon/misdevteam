/***************************************************************************************************
* 파일명 : SE_SAL_1420_ADM.java
* 기능 : 판매 - 지대관리 - 매출관리 - 지대원장
* 작성일자 : 2009-04-06
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


public class SE_SAL_1420_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd				;
	public String yymm					;
	public String area_cd					;
	public String bo_cd					;
	public String bo_seq				;
	public String icdc_calc_qty_110		;
	public String spsl_qty_110			;
	public String rdff_rdu_uprc_110		;
	public String dnt_qty_110			;
	public String stetsell_qty_110		;
	public String stetsell_uprc_110		;
	public String incmp_sale_qty_110	;
	public String incmp_sale_amt_110	;
	public String prvmm_val_qty_110		;
	public String fpymt_encur_amt_110	;
	public String sale_amt_110			;
	public String net_sale_amt_110		;
	public String rdff_rdu_uprc_130		;
	public String icdc_calc_qty_130		;
	public String spsl_qty_130			;
	public String dnt_qty_130			;
	public String stetsell_qty_130		;
	public String stetsell_uprc_130		;
	public String incmp_sale_qty_130	;
	public String incmp_sale_amt_130	;
	public String prvmm_val_qty_130		;
	public String fpymt_encur_amt_130	;
	public String sale_amt_130			;
	public String net_sale_amt_130		;
	public String incmg_pers_ip			;
	public String incmg_pers			;

	public SE_SAL_1420_ADM(){}
	public SE_SAL_1420_ADM(String cmpy_cd, String yymm, String area_cd, String bo_cd, String bo_seq, String icdc_calc_qty_110, String spsl_qty_110, String rdff_rdu_uprc_110, String dnt_qty_110, String stetsell_qty_110, String stetsell_uprc_110, String incmp_sale_qty_110, String incmp_sale_amt_110, String prvmm_val_qty_110, String fpymt_encur_amt_110, String sale_amt_110, String net_sale_amt_110, String rdff_rdu_uprc_130, String icdc_calc_qty_130, String spsl_qty_130, String dnt_qty_130, String stetsell_qty_130, String stetsell_uprc_130, String incmp_sale_qty_130, String incmp_sale_amt_130, String prvmm_val_qty_130, String fpymt_encur_amt_130, String sale_amt_130, String net_sale_amt_130, String incmg_pers_ip, String incmg_pers){
		this.cmpy_cd 				= cmpy_cd				;
		this.yymm 					= yymm					;
		this.area_cd 				= area_cd				;
		this.bo_cd 					= bo_cd					;
		this.bo_seq 				= bo_seq				;
		this.icdc_calc_qty_110 		= icdc_calc_qty_110		;
		this.spsl_qty_110 			= spsl_qty_110			;
		this.rdff_rdu_uprc_110 		= rdff_rdu_uprc_110		;
		this.dnt_qty_110 			= dnt_qty_110			;
		this.stetsell_qty_110 		= stetsell_qty_110		;
		this.stetsell_uprc_110 		= stetsell_uprc_110		;
		this.incmp_sale_qty_110 	= incmp_sale_qty_110	;
		this.incmp_sale_amt_110 	= incmp_sale_amt_110	;
		this.prvmm_val_qty_110 		= prvmm_val_qty_110		;
		this.fpymt_encur_amt_110 	= fpymt_encur_amt_110	;
		this.sale_amt_110 			= sale_amt_110			;
		this.net_sale_amt_110 		= net_sale_amt_110		;
		this.rdff_rdu_uprc_130 		= rdff_rdu_uprc_130		;
		this.icdc_calc_qty_130 		= icdc_calc_qty_130		;
		this.spsl_qty_130 			= spsl_qty_130			;
		this.dnt_qty_130 			= dnt_qty_130			;
		this.stetsell_qty_130 		= stetsell_qty_130		;
		this.stetsell_uprc_130 		= stetsell_uprc_130		;
		this.incmp_sale_qty_130 	= incmp_sale_qty_130	;
		this.incmp_sale_amt_130 	= incmp_sale_amt_130	;
		this.prvmm_val_qty_130		= prvmm_val_qty_130		;
		this.fpymt_encur_amt_130 	= fpymt_encur_amt_130	;
		this.sale_amt_130 			= sale_amt_130			;
		this.net_sale_amt_130	 	= net_sale_amt_130		;
		this.incmg_pers_ip 			= incmg_pers_ip			;
		this.incmg_pers 			= incmg_pers			;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setYymm(String yymm){
		this.yymm = yymm;
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

	public void setIcdc_calc_qty_110(String icdc_calc_qty_110){
		this.icdc_calc_qty_110 = icdc_calc_qty_110;
	}

	public void setSpsl_qty_110(String spsl_qty_110){
		this.spsl_qty_110 = spsl_qty_110;
	}

	public void setRdff_rdu_uprc_110(String rdff_rdu_uprc_110){
		this.rdff_rdu_uprc_110 = rdff_rdu_uprc_110;
	}

	public void setDnt_qty_110(String dnt_qty_110){
		this.dnt_qty_110 = dnt_qty_110;
	}

	public void setStetsell_qty_110(String stetsell_qty_110){
		this.stetsell_qty_110 = stetsell_qty_110;
	}

	public void setStetsell_uprc_110(String stetsell_uprc_110){
		this.stetsell_uprc_110 = stetsell_uprc_110;
	}

	public void setIncmp_sale_qty_110(String incmp_sale_qty_110){
		this.incmp_sale_qty_110 = incmp_sale_qty_110;
	}

	public void setIncmp_sale_amt_110(String incmp_sale_amt_110){
		this.incmp_sale_amt_110 = incmp_sale_amt_110;
	}

	public void setPrvmm_val_qty_110(String prvmm_val_qty_110){
		this.prvmm_val_qty_110 = prvmm_val_qty_110;
	}

	public void setFpymt_encur_amt_110(String fpymt_encur_amt_110){
		this.fpymt_encur_amt_110 = fpymt_encur_amt_110;
	}

	public void setSale_amt_110(String sale_amt_110){
		this.sale_amt_110 = sale_amt_110;
	}

	public void setNet_sale_amt_110(String net_sale_amt_110){
		this.net_sale_amt_110 = net_sale_amt_110;
	}

	public void setRdff_rdu_uprc_130(String rdff_rdu_uprc_130){
		this.rdff_rdu_uprc_130 = rdff_rdu_uprc_130;
	}

	public void setIcdc_calc_qty_130(String icdc_calc_qty_130){
		this.icdc_calc_qty_130 = icdc_calc_qty_130;
	}

	public void setSpsl_qty_130(String spsl_qty_130){
		this.spsl_qty_130 = spsl_qty_130;
	}

	public void setDnt_qty_130(String dnt_qty_130){
		this.dnt_qty_130 = dnt_qty_130;
	}

	public void setStetsell_qty_130(String stetsell_qty_130){
		this.stetsell_qty_130 = stetsell_qty_130;
	}

	public void setStetsell_uprc_130(String stetsell_uprc_130){
		this.stetsell_uprc_130 = stetsell_uprc_130;
	}

	public void setIncmp_sale_qty_130(String incmp_sale_qty_130){
		this.incmp_sale_qty_130 = incmp_sale_qty_130;
	}

	public void setIncmp_sale_amt_130(String incmp_sale_amt_130){
		this.incmp_sale_amt_130 = incmp_sale_amt_130;
	}

	public void setPrvmm_val_qty_130(String prvmm_val_qty_130){
		this.prvmm_val_qty_130 = prvmm_val_qty_130;
	}

	public void setFpymt_encur_amt_130(String fpymt_encur_amt_130){
		this.fpymt_encur_amt_130 = fpymt_encur_amt_130;
	}

	public void setSale_amt_130(String sale_amt_130){
		this.sale_amt_130 = sale_amt_130;
	}

	public void setNet_sale_amt_130(String net_sale_amt_130){
		this.net_sale_amt_130 = net_sale_amt_130;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getYymm(){
		return this.yymm;
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

	public String getIcdc_calc_qty_110(){
		return this.icdc_calc_qty_110;
	}

	public String getSpsl_qty_110(){
		return this.spsl_qty_110;
	}

	public String getRdff_rdu_uprc_110(){
		return this.rdff_rdu_uprc_110;
	}

	public String getDnt_qty_110(){
		return this.dnt_qty_110;
	}

	public String getStetsell_qty_110(){
		return this.stetsell_qty_110;
	}

	public String getStetsell_uprc_110(){
		return this.stetsell_uprc_110;
	}

	public String getIncmp_sale_qty_110(){
		return this.incmp_sale_qty_110;
	}

	public String getIncmp_sale_amt_110(){
		return this.incmp_sale_amt_110;
	}

	public String getPrvmm_val_qty_110(){
		return this.prvmm_val_qty_110;
	}

	public String getFpymt_encur_amt_110(){
		return this.fpymt_encur_amt_110;
	}

	public String getSale_amt_110(){
		return this.sale_amt_110;
	}

	public String getNet_sale_amt_110(){
		return this.net_sale_amt_110;
	}

	public String getRdff_rdu_uprc_130(){
		return this.rdff_rdu_uprc_130;
	}

	public String getIcdc_calc_qty_130(){
		return this.icdc_calc_qty_130;
	}

	public String getSpsl_qty_130(){
		return this.spsl_qty_130;
	}

	public String getDnt_qty_130(){
		return this.dnt_qty_130;
	}

	public String getStetsell_qty_130(){
		return this.stetsell_qty_130;
	}

	public String getStetsell_uprc_130(){
		return this.stetsell_uprc_130;
	}

	public String getIncmp_sale_qty_130(){
		return this.incmp_sale_qty_130;
	}

	public String getIncmp_sale_amt_130(){
		return this.incmp_sale_amt_130;
	}

	public String getPrvmm_val_qty_130(){
		return this.prvmm_val_qty_130;
	}

	public String getFpymt_encur_amt_130(){
		return this.fpymt_encur_amt_130;
	}

	public String getSale_amt_130(){
		return this.sale_amt_130;
	}

	public String getNet_sale_amt_130(){
		return this.net_sale_amt_130;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call SP_SE_SAL_1420_A( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_SAL_1420_ADM dm = (SE_SAL_1420_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString( 3, dm.cmpy_cd				);
		cstmt.setString( 4, dm.yymm					);
		cstmt.setString( 5, dm.area_cd				);
		cstmt.setString( 6, dm.bo_cd				);
		cstmt.setString( 7, dm.bo_seq				);
		cstmt.setString( 8, dm.icdc_calc_qty_110	);
		cstmt.setString( 9, dm.spsl_qty_110			);
		cstmt.setString(10, dm.rdff_rdu_uprc_110	);
		cstmt.setString(11, dm.dnt_qty_110			);
		cstmt.setString(12, dm.stetsell_qty_110		);
		cstmt.setString(13, dm.stetsell_uprc_110	);
		cstmt.setString(14, dm.incmp_sale_qty_110	);
		cstmt.setString(15, dm.incmp_sale_amt_110	);
		cstmt.setString(16, dm.prvmm_val_qty_110	);
		cstmt.setString(17, dm.fpymt_encur_amt_110	);
		cstmt.setString(18, dm.sale_amt_110			);
		cstmt.setString(19, dm.net_sale_amt_110		);
		cstmt.setString(20, dm.rdff_rdu_uprc_130	);
		cstmt.setString(21, dm.icdc_calc_qty_130	);
		cstmt.setString(22, dm.spsl_qty_130			);
		cstmt.setString(23, dm.dnt_qty_130			);
		cstmt.setString(24, dm.stetsell_qty_130		);
		cstmt.setString(25, dm.stetsell_uprc_130	);
		cstmt.setString(26, dm.incmp_sale_qty_130	);
		cstmt.setString(27, dm.incmp_sale_amt_130	);
		cstmt.setString(28, dm.prvmm_val_qty_130	);
		cstmt.setString(29, dm.fpymt_encur_amt_130	);
		cstmt.setString(30, dm.sale_amt_130			);
		cstmt.setString(31, dm.net_sale_amt_130		);
		cstmt.setString(32, dm.incmg_pers_ip		);
		cstmt.setString(33, dm.incmg_pers			);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.sal.ds.SE_SAL_1420_ADataSet();
	}

    public void print(){
        System.out.println("cmpy_cd 			= " + getCmpy_cd				());
        System.out.println("yymm 				= " + getYymm					());
        System.out.println("area_cd				= " + getArea_cd				());
        System.out.println("bo_cd 				= " + getBo_cd					());
        System.out.println("bo_seq 				= " + getBo_seq					());
        System.out.println("icdc_calc_qty_110 	= " + getIcdc_calc_qty_110		());
        System.out.println("spsl_qty_110 		= " + getSpsl_qty_110			());
        System.out.println("rdff_rdu_uprc_110 	= " + getRdff_rdu_uprc_110		());
        System.out.println("dnt_qty_110 		= " + getDnt_qty_110			());
        System.out.println("stetsell_qty_110 	= " + getStetsell_qty_110		());
        System.out.println("stetsell_uprc_110 	= " + getStetsell_uprc_110		());
        System.out.println("incmp_sale_qty_110 	= " + getIncmp_sale_qty_110		());
        System.out.println("incmp_sale_amt_110 	= " + getIncmp_sale_amt_110		());
        System.out.println("prvmm_val_qty_110 	= " + getPrvmm_val_qty_110		());
        System.out.println("fpymt_encur_amt_110 = " + getFpymt_encur_amt_110	());
        System.out.println("sale_amt_110 		= " + getSale_amt_110			());
        System.out.println("net_sale_amt_110 	= " + getNet_sale_amt_110		());
        System.out.println("rdff_rdu_uprc_130 	= " + getRdff_rdu_uprc_130		());
        System.out.println("icdc_calc_qty_130 	= " + getIcdc_calc_qty_130		());
        System.out.println("spsl_qty_130 		= " + getSpsl_qty_130			());
        System.out.println("dnt_qty_130 		= " + getDnt_qty_130			());
        System.out.println("stetsell_qty_130 	= " + getStetsell_qty_130		());
        System.out.println("stetsell_uprc_130 	= " + getStetsell_uprc_130		());
        System.out.println("incmp_sale_qty_130 	= " + getIncmp_sale_qty_130		());
        System.out.println("incmp_sale_amt_130 	= " + getIncmp_sale_amt_130		());
        System.out.println("prvmm_val_qty_130 	= " + getPrvmm_val_qty_130		());
        System.out.println("fpymt_encur_amt_130 = " + getFpymt_encur_amt_130	());
        System.out.println("sale_amt_130 		= " + getSale_amt_130			());
        System.out.println("net_sale_amt_130 	= " + getNet_sale_amt_130		());
        System.out.println("incmg_pers_ip 		= " + getIncmg_pers_ip			());
        System.out.println("incmg_pers 			= " + getIncmg_pers				());
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
String yymm = req.getParameter("yymm");
if( yymm == null){
	System.out.println(this.toString+" : yymm is null" );
}else{
	System.out.println(this.toString+" : yymm is "+yymm );
}
String area = req.getParameter("area");
if( area == null){
	System.out.println(this.toString+" : area is null" );
}else{
	System.out.println(this.toString+" : area is "+area );
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
String icdc_calc_qty_110 = req.getParameter("icdc_calc_qty_110");
if( icdc_calc_qty_110 == null){
	System.out.println(this.toString+" : icdc_calc_qty_110 is null" );
}else{
	System.out.println(this.toString+" : icdc_calc_qty_110 is "+icdc_calc_qty_110 );
}
String spsl_qty_110 = req.getParameter("spsl_qty_110");
if( spsl_qty_110 == null){
	System.out.println(this.toString+" : spsl_qty_110 is null" );
}else{
	System.out.println(this.toString+" : spsl_qty_110 is "+spsl_qty_110 );
}
String rdff_rdu_uprc_110 = req.getParameter("rdff_rdu_uprc_110");
if( rdff_rdu_uprc_110 == null){
	System.out.println(this.toString+" : rdff_rdu_uprc_110 is null" );
}else{
	System.out.println(this.toString+" : rdff_rdu_uprc_110 is "+rdff_rdu_uprc_110 );
}
String dnt_qty_110 = req.getParameter("dnt_qty_110");
if( dnt_qty_110 == null){
	System.out.println(this.toString+" : dnt_qty_110 is null" );
}else{
	System.out.println(this.toString+" : dnt_qty_110 is "+dnt_qty_110 );
}
String stetsell_qty_110 = req.getParameter("stetsell_qty_110");
if( stetsell_qty_110 == null){
	System.out.println(this.toString+" : stetsell_qty_110 is null" );
}else{
	System.out.println(this.toString+" : stetsell_qty_110 is "+stetsell_qty_110 );
}
String stetsell_uprc_110 = req.getParameter("stetsell_uprc_110");
if( stetsell_uprc_110 == null){
	System.out.println(this.toString+" : stetsell_uprc_110 is null" );
}else{
	System.out.println(this.toString+" : stetsell_uprc_110 is "+stetsell_uprc_110 );
}
String incmp_sale_qty_110 = req.getParameter("incmp_sale_qty_110");
if( incmp_sale_qty_110 == null){
	System.out.println(this.toString+" : incmp_sale_qty_110 is null" );
}else{
	System.out.println(this.toString+" : incmp_sale_qty_110 is "+incmp_sale_qty_110 );
}
String incmp_sale_amt_110 = req.getParameter("incmp_sale_amt_110");
if( incmp_sale_amt_110 == null){
	System.out.println(this.toString+" : incmp_sale_amt_110 is null" );
}else{
	System.out.println(this.toString+" : incmp_sale_amt_110 is "+incmp_sale_amt_110 );
}
String prvmm_val_qty_110 = req.getParameter("prvmm_val_qty_110");
if( prvmm_val_qty_110 == null){
	System.out.println(this.toString+" : prvmm_val_qty_110 is null" );
}else{
	System.out.println(this.toString+" : prvmm_val_qty_110 is "+prvmm_val_qty_110 );
}
String fpymt_encur_amt_110 = req.getParameter("fpymt_encur_amt_110");
if( fpymt_encur_amt_110 == null){
	System.out.println(this.toString+" : fpymt_encur_amt_110 is null" );
}else{
	System.out.println(this.toString+" : fpymt_encur_amt_110 is "+fpymt_encur_amt_110 );
}
String sale_amt_110 = req.getParameter("sale_amt_110");
if( sale_amt_110 == null){
	System.out.println(this.toString+" : sale_amt_110 is null" );
}else{
	System.out.println(this.toString+" : sale_amt_110 is "+sale_amt_110 );
}
String net_sale_amt_110 = req.getParameter("net_sale_amt_110");
if( net_sale_amt_110 == null){
	System.out.println(this.toString+" : net_sale_amt_110 is null" );
}else{
	System.out.println(this.toString+" : net_sale_amt_110 is "+net_sale_amt_110 );
}
String rdff_rdu_uprc_130 = req.getParameter("rdff_rdu_uprc_130");
if( rdff_rdu_uprc_130 == null){
	System.out.println(this.toString+" : rdff_rdu_uprc_130 is null" );
}else{
	System.out.println(this.toString+" : rdff_rdu_uprc_130 is "+rdff_rdu_uprc_130 );
}
String icdc_calc_qty_130 = req.getParameter("icdc_calc_qty_130");
if( icdc_calc_qty_130 == null){
	System.out.println(this.toString+" : icdc_calc_qty_130 is null" );
}else{
	System.out.println(this.toString+" : icdc_calc_qty_130 is "+icdc_calc_qty_130 );
}
String spsl_qty_130 = req.getParameter("spsl_qty_130");
if( spsl_qty_130 == null){
	System.out.println(this.toString+" : spsl_qty_130 is null" );
}else{
	System.out.println(this.toString+" : spsl_qty_130 is "+spsl_qty_130 );
}
String dnt_qty_130 = req.getParameter("dnt_qty_130");
if( dnt_qty_130 == null){
	System.out.println(this.toString+" : dnt_qty_130 is null" );
}else{
	System.out.println(this.toString+" : dnt_qty_130 is "+dnt_qty_130 );
}
String stetsell_qty_130 = req.getParameter("stetsell_qty_130");
if( stetsell_qty_130 == null){
	System.out.println(this.toString+" : stetsell_qty_130 is null" );
}else{
	System.out.println(this.toString+" : stetsell_qty_130 is "+stetsell_qty_130 );
}
String stetsell_uprc_130 = req.getParameter("stetsell_uprc_130");
if( stetsell_uprc_130 == null){
	System.out.println(this.toString+" : stetsell_uprc_130 is null" );
}else{
	System.out.println(this.toString+" : stetsell_uprc_130 is "+stetsell_uprc_130 );
}
String incmp_sale_qty_130 = req.getParameter("incmp_sale_qty_130");
if( incmp_sale_qty_130 == null){
	System.out.println(this.toString+" : incmp_sale_qty_130 is null" );
}else{
	System.out.println(this.toString+" : incmp_sale_qty_130 is "+incmp_sale_qty_130 );
}
String incmp_sale_amt_130 = req.getParameter("incmp_sale_amt_130");
if( incmp_sale_amt_130 == null){
	System.out.println(this.toString+" : incmp_sale_amt_130 is null" );
}else{
	System.out.println(this.toString+" : incmp_sale_amt_130 is "+incmp_sale_amt_130 );
}
String prvmm_val_qty_130 = req.getParameter("prvmm_val_qty_130");
if( prvmm_val_qty_130 == null){
	System.out.println(this.toString+" : prvmm_val_qty_130 is null" );
}else{
	System.out.println(this.toString+" : prvmm_val_qty_130 is "+prvmm_val_qty_130 );
}
String fpymt_encur_amt_130 = req.getParameter("fpymt_encur_amt_130");
if( fpymt_encur_amt_130 == null){
	System.out.println(this.toString+" : fpymt_encur_amt_130 is null" );
}else{
	System.out.println(this.toString+" : fpymt_encur_amt_130 is "+fpymt_encur_amt_130 );
}
String sale_amt_130 = req.getParameter("sale_amt_130");
if( sale_amt_130 == null){
	System.out.println(this.toString+" : sale_amt_130 is null" );
}else{
	System.out.println(this.toString+" : sale_amt_130 is "+sale_amt_130 );
}
String net_sale_amt_130 = req.getParameter("net_sale_amt_130");
if( net_sale_amt_130 == null){
	System.out.println(this.toString+" : net_sale_amt_130 is null" );
}else{
	System.out.println(this.toString+" : net_sale_amt_130 is "+net_sale_amt_130 );
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String yymm = Util.checkString(req.getParameter("yymm"));
String area = Util.checkString(req.getParameter("area"));
String bo_cd = Util.checkString(req.getParameter("bo_cd"));
String bo_seq = Util.checkString(req.getParameter("bo_seq"));
String icdc_calc_qty_110 = Util.checkString(req.getParameter("icdc_calc_qty_110"));
String spsl_qty_110 = Util.checkString(req.getParameter("spsl_qty_110"));
String rdff_rdu_uprc_110 = Util.checkString(req.getParameter("rdff_rdu_uprc_110"));
String dnt_qty_110 = Util.checkString(req.getParameter("dnt_qty_110"));
String stetsell_qty_110 = Util.checkString(req.getParameter("stetsell_qty_110"));
String stetsell_uprc_110 = Util.checkString(req.getParameter("stetsell_uprc_110"));
String incmp_sale_qty_110 = Util.checkString(req.getParameter("incmp_sale_qty_110"));
String incmp_sale_amt_110 = Util.checkString(req.getParameter("incmp_sale_amt_110"));
String prvmm_val_qty_110 = Util.checkString(req.getParameter("prvmm_val_qty_110"));
String fpymt_encur_amt_110 = Util.checkString(req.getParameter("fpymt_encur_amt_110"));
String sale_amt_110 = Util.checkString(req.getParameter("sale_amt_110"));
String net_sale_amt_110 = Util.checkString(req.getParameter("net_sale_amt_110"));
String rdff_rdu_uprc_130 = Util.checkString(req.getParameter("rdff_rdu_uprc_130"));
String icdc_calc_qty_130 = Util.checkString(req.getParameter("icdc_calc_qty_130"));
String spsl_qty_130 = Util.checkString(req.getParameter("spsl_qty_130"));
String dnt_qty_130 = Util.checkString(req.getParameter("dnt_qty_130"));
String stetsell_qty_130 = Util.checkString(req.getParameter("stetsell_qty_130"));
String stetsell_uprc_130 = Util.checkString(req.getParameter("stetsell_uprc_130"));
String incmp_sale_qty_130 = Util.checkString(req.getParameter("incmp_sale_qty_130"));
String incmp_sale_amt_130 = Util.checkString(req.getParameter("incmp_sale_amt_130"));
String prvmm_val_qty_130 = Util.checkString(req.getParameter("prvmm_val_qty_130"));
String fpymt_encur_amt_130 = Util.checkString(req.getParameter("fpymt_encur_amt_130"));
String sale_amt_130 = Util.checkString(req.getParameter("sale_amt_130"));
String net_sale_amt_130 = Util.checkString(req.getParameter("net_sale_amt_130"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("yymm")));
String area = Util.Uni2Ksc(Util.checkString(req.getParameter("area")));
String bo_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_cd")));
String bo_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_seq")));
String icdc_calc_qty_110 = Util.Uni2Ksc(Util.checkString(req.getParameter("icdc_calc_qty_110")));
String spsl_qty_110 = Util.Uni2Ksc(Util.checkString(req.getParameter("spsl_qty_110")));
String rdff_rdu_uprc_110 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdff_rdu_uprc_110")));
String dnt_qty_110 = Util.Uni2Ksc(Util.checkString(req.getParameter("dnt_qty_110")));
String stetsell_qty_110 = Util.Uni2Ksc(Util.checkString(req.getParameter("stetsell_qty_110")));
String stetsell_uprc_110 = Util.Uni2Ksc(Util.checkString(req.getParameter("stetsell_uprc_110")));
String incmp_sale_qty_110 = Util.Uni2Ksc(Util.checkString(req.getParameter("incmp_sale_qty_110")));
String incmp_sale_amt_110 = Util.Uni2Ksc(Util.checkString(req.getParameter("incmp_sale_amt_110")));
String prvmm_val_qty_110 = Util.Uni2Ksc(Util.checkString(req.getParameter("prvmm_val_qty_110")));
String fpymt_encur_amt_110 = Util.Uni2Ksc(Util.checkString(req.getParameter("fpymt_encur_amt_110")));
String sale_amt_110 = Util.Uni2Ksc(Util.checkString(req.getParameter("sale_amt_110")));
String net_sale_amt_110 = Util.Uni2Ksc(Util.checkString(req.getParameter("net_sale_amt_110")));
String rdff_rdu_uprc_130 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdff_rdu_uprc_130")));
String icdc_calc_qty_130 = Util.Uni2Ksc(Util.checkString(req.getParameter("icdc_calc_qty_130")));
String spsl_qty_130 = Util.Uni2Ksc(Util.checkString(req.getParameter("spsl_qty_130")));
String dnt_qty_130 = Util.Uni2Ksc(Util.checkString(req.getParameter("dnt_qty_130")));
String stetsell_qty_130 = Util.Uni2Ksc(Util.checkString(req.getParameter("stetsell_qty_130")));
String stetsell_uprc_130 = Util.Uni2Ksc(Util.checkString(req.getParameter("stetsell_uprc_130")));
String incmp_sale_qty_130 = Util.Uni2Ksc(Util.checkString(req.getParameter("incmp_sale_qty_130")));
String incmp_sale_amt_130 = Util.Uni2Ksc(Util.checkString(req.getParameter("incmp_sale_amt_130")));
String prvmm_val_qty_130 = Util.Uni2Ksc(Util.checkString(req.getParameter("prvmm_val_qty_130")));
String fpymt_encur_amt_130 = Util.Uni2Ksc(Util.checkString(req.getParameter("fpymt_encur_amt_130")));
String sale_amt_130 = Util.Uni2Ksc(Util.checkString(req.getParameter("sale_amt_130")));
String net_sale_amt_130 = Util.Uni2Ksc(Util.checkString(req.getParameter("net_sale_amt_130")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setYymm(yymm);
dm.setArea(area);
dm.setBo_cd(bo_cd);
dm.setBo_seq(bo_seq);
dm.setIcdc_calc_qty_110(icdc_calc_qty_110);
dm.setSpsl_qty_110(spsl_qty_110);
dm.setRdff_rdu_uprc_110(rdff_rdu_uprc_110);
dm.setDnt_qty_110(dnt_qty_110);
dm.setStetsell_qty_110(stetsell_qty_110);
dm.setStetsell_uprc_110(stetsell_uprc_110);
dm.setIncmp_sale_qty_110(incmp_sale_qty_110);
dm.setIncmp_sale_amt_110(incmp_sale_amt_110);
dm.setPrvmm_val_qty_110(prvmm_val_qty_110);
dm.setFpymt_encur_amt_110(fpymt_encur_amt_110);
dm.setSale_amt_110(sale_amt_110);
dm.setNet_sale_amt_110(net_sale_amt_110);
dm.setRdff_rdu_uprc_130(rdff_rdu_uprc_130);
dm.setIcdc_calc_qty_130(icdc_calc_qty_130);
dm.setSpsl_qty_130(spsl_qty_130);
dm.setDnt_qty_130(dnt_qty_130);
dm.setStetsell_qty_130(stetsell_qty_130);
dm.setStetsell_uprc_130(stetsell_uprc_130);
dm.setIncmp_sale_qty_130(incmp_sale_qty_130);
dm.setIncmp_sale_amt_130(incmp_sale_amt_130);
dm.setPrvmm_val_qty_130(prvmm_val_qty_130);
dm.setFpymt_encur_amt_130(fpymt_encur_amt_130);
dm.setSale_amt_130(sale_amt_130);
dm.setNet_sale_amt_130(net_sale_amt_130);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Apr 06 20:41:20 KST 2009 */