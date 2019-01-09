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


package chosun.ciis.ad.res.dm;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import somo.framework.db.BaseDM;
import somo.framework.db.BaseDataSet;

/**
 * 
 */


public class AD_RES_1430_UDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String medi_cd;
	public String pubc_dt;
	public String mode0;
	public String preng_occr_seq0;
	public String issu_side0;
	public String sect_cd0;
	public String sect_seq0;
	public String cm0;
	public String dn0;
	public String chro_clsf0;
	public String advt_cont0;
	public String uprc0;
	public String advt_fee0;
	public String slcrg_pers0;
	public String agn0;
	public String dlco_clsf0;
	public String mode1;
	public String preng_occr_seq1;
	public String issu_side1;
	public String sect_cd1;
	public String sect_seq1;
	public String cm1;
	public String dn1;
	public String chro_clsf1;
	public String advt_cont1;
	public String uprc1;
	public String advt_fee1;
	public String slcrg_pers1;
	public String agn1;
	public String dlco_clsf1;
	public String mode2;
	public String preng_occr_seq2;
	public String issu_side2;
	public String sect_cd2;
	public String sect_seq2;
	public String cm2;
	public String dn2;
	public String chro_clsf2;
	public String advt_cont2;
	public String uprc2;
	public String advt_fee2;
	public String slcrg_pers2;
	public String agn2;
	public String dlco_clsf2;
	public String mode3;
	public String preng_occr_seq3;
	public String issu_side3;
	public String sect_cd3;
	public String sect_seq3;
	public String cm3;
	public String dn3;
	public String chro_clsf3;
	public String advt_cont3;
	public String uprc3;
	public String advt_fee3;
	public String slcrg_pers3;
	public String agn3;
	public String dlco_clsf3;
	public String mode4;
	public String preng_occr_seq4;
	public String issu_side4;
	public String sect_cd4;
	public String sect_seq4;
	public String cm4;
	public String dn4;
	public String chro_clsf4;
	public String advt_cont4;
	public String uprc4;
	public String advt_fee4;
	public String slcrg_pers4;
	public String agn4;
	public String dlco_clsf4;
	public String mode5;
	public String preng_occr_seq5;
	public String issu_side5;
	public String sect_cd5;
	public String sect_seq5;
	public String cm5;
	public String dn5;
	public String chro_clsf5;
	public String advt_cont5;
	public String uprc5;
	public String advt_fee5;
	public String slcrg_pers5;
	public String agn5;
	public String dlco_clsf5;
	public String mode6;
	public String preng_occr_seq6;
	public String issu_side6;
	public String sect_cd6;
	public String sect_seq6;
	public String cm6;
	public String dn6;
	public String chro_clsf6;
	public String advt_cont6;
	public String uprc6;
	public String advt_fee6;
	public String slcrg_pers6;
	public String agn6;
	public String dlco_clsf6;
	public String mode7;
	public String preng_occr_seq7;
	public String issu_side7;
	public String sect_cd7;
	public String sect_seq7;
	public String cm7;
	public String dn7;
	public String chro_clsf7;
	public String advt_cont7;
	public String uprc7;
	public String advt_fee7;
	public String slcrg_pers7;
	public String agn7;
	public String dlco_clsf7;
	public String mode8;
	public String preng_occr_seq8;
	public String issu_side8;
	public String sect_cd8;
	public String sect_seq8;
	public String cm8;
	public String dn8;
	public String chro_clsf8;
	public String advt_cont8;
	public String uprc8;
	public String advt_fee8;
	public String slcrg_pers8;
	public String agn8;
	public String dlco_clsf8;
	public String unasin_uprc;
	public String incmg_pers_ip;
	public String incmg_pers;

	public AD_RES_1430_UDM(){}
	public AD_RES_1430_UDM(String cmpy_cd, String medi_cd, String pubc_dt, String mode0, String preng_occr_seq0, String issu_side0, String sect_cd0, String sect_seq0, String cm0, String dn0, String chro_clsf0, String advt_cont0, String uprc0, String advt_fee0, String slcrg_pers0, String agn0, String dlco_clsf0, String mode1, String preng_occr_seq1, String issu_side1, String sect_cd1, String sect_seq1, String cm1, String dn1, String chro_clsf1, String advt_cont1, String uprc1, String advt_fee1, String slcrg_pers1, String agn1, String dlco_clsf1, String mode2, String preng_occr_seq2, String issu_side2, String sect_cd2, String sect_seq2, String cm2, String dn2, String chro_clsf2, String advt_cont2, String uprc2, String advt_fee2, String slcrg_pers2, String agn2, String dlco_clsf2, String mode3, String preng_occr_seq3, String issu_side3, String sect_cd3, String sect_seq3, String cm3, String dn3, String chro_clsf3, String advt_cont3, String uprc3, String advt_fee3, String slcrg_pers3, String agn3, String dlco_clsf3, String mode4, String preng_occr_seq4, String issu_side4, String sect_cd4, String sect_seq4, String cm4, String dn4, String chro_clsf4, String advt_cont4, String uprc4, String advt_fee4, String slcrg_pers4, String agn4, String dlco_clsf4, String mode5, String preng_occr_seq5, String issu_side5, String sect_cd5, String sect_seq5, String cm5, String dn5, String chro_clsf5, String advt_cont5, String uprc5, String advt_fee5, String slcrg_pers5, String agn5, String dlco_clsf5, String mode6, String preng_occr_seq6, String issu_side6, String sect_cd6, String sect_seq6, String cm6, String dn6, String chro_clsf6, String advt_cont6, String uprc6, String advt_fee6, String slcrg_pers6, String agn6, String dlco_clsf6, String mode7, String preng_occr_seq7, String issu_side7, String sect_cd7, String sect_seq7, String cm7, String dn7, String chro_clsf7, String advt_cont7, String uprc7, String advt_fee7, String slcrg_pers7, String agn7, String dlco_clsf7, String mode8, String preng_occr_seq8, String issu_side8, String sect_cd8, String sect_seq8, String cm8, String dn8, String chro_clsf8, String advt_cont8, String uprc8, String advt_fee8, String slcrg_pers8, String agn8, String dlco_clsf8, String unasin_uprc, String incmg_pers_ip, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.medi_cd = medi_cd;
		this.pubc_dt = pubc_dt;
		this.mode0 = mode0;
		this.preng_occr_seq0 = preng_occr_seq0;
		this.issu_side0 = issu_side0;
		this.sect_cd0 = sect_cd0;
		this.sect_seq0 = sect_seq0;
		this.cm0 = cm0;
		this.dn0 = dn0;
		this.chro_clsf0 = chro_clsf0;
		this.advt_cont0 = advt_cont0;
		this.uprc0 = uprc0;
		this.advt_fee0 = advt_fee0;
		this.slcrg_pers0 = slcrg_pers0;
		this.agn0 = agn0;
		this.dlco_clsf0 = dlco_clsf0;
		this.mode1 = mode1;
		this.preng_occr_seq1 = preng_occr_seq1;
		this.issu_side1 = issu_side1;
		this.sect_cd1 = sect_cd1;
		this.sect_seq1 = sect_seq1;
		this.cm1 = cm1;
		this.dn1 = dn1;
		this.chro_clsf1 = chro_clsf1;
		this.advt_cont1 = advt_cont1;
		this.uprc1 = uprc1;
		this.advt_fee1 = advt_fee1;
		this.slcrg_pers1 = slcrg_pers1;
		this.agn1 = agn1;
		this.dlco_clsf1 = dlco_clsf1;
		this.mode2 = mode2;
		this.preng_occr_seq2 = preng_occr_seq2;
		this.issu_side2 = issu_side2;
		this.sect_cd2 = sect_cd2;
		this.sect_seq2 = sect_seq2;
		this.cm2 = cm2;
		this.dn2 = dn2;
		this.chro_clsf2 = chro_clsf2;
		this.advt_cont2 = advt_cont2;
		this.uprc2 = uprc2;
		this.advt_fee2 = advt_fee2;
		this.slcrg_pers2 = slcrg_pers2;
		this.agn2 = agn2;
		this.dlco_clsf2 = dlco_clsf2;
		this.mode3 = mode3;
		this.preng_occr_seq3 = preng_occr_seq3;
		this.issu_side3 = issu_side3;
		this.sect_cd3 = sect_cd3;
		this.sect_seq3 = sect_seq3;
		this.cm3 = cm3;
		this.dn3 = dn3;
		this.chro_clsf3 = chro_clsf3;
		this.advt_cont3 = advt_cont3;
		this.uprc3 = uprc3;
		this.advt_fee3 = advt_fee3;
		this.slcrg_pers3 = slcrg_pers3;
		this.agn3 = agn3;
		this.dlco_clsf3 = dlco_clsf3;
		this.mode4 = mode4;
		this.preng_occr_seq4 = preng_occr_seq4;
		this.issu_side4 = issu_side4;
		this.sect_cd4 = sect_cd4;
		this.sect_seq4 = sect_seq4;
		this.cm4 = cm4;
		this.dn4 = dn4;
		this.chro_clsf4 = chro_clsf4;
		this.advt_cont4 = advt_cont4;
		this.uprc4 = uprc4;
		this.advt_fee4 = advt_fee4;
		this.slcrg_pers4 = slcrg_pers4;
		this.agn4 = agn4;
		this.dlco_clsf4 = dlco_clsf4;
		this.mode5 = mode5;
		this.preng_occr_seq5 = preng_occr_seq5;
		this.issu_side5 = issu_side5;
		this.sect_cd5 = sect_cd5;
		this.sect_seq5 = sect_seq5;
		this.cm5 = cm5;
		this.dn5 = dn5;
		this.chro_clsf5 = chro_clsf5;
		this.advt_cont5 = advt_cont5;
		this.uprc5 = uprc5;
		this.advt_fee5 = advt_fee5;
		this.slcrg_pers5 = slcrg_pers5;
		this.agn5 = agn5;
		this.dlco_clsf5 = dlco_clsf5;
		this.mode6 = mode6;
		this.preng_occr_seq6 = preng_occr_seq6;
		this.issu_side6 = issu_side6;
		this.sect_cd6 = sect_cd6;
		this.sect_seq6 = sect_seq6;
		this.cm6 = cm6;
		this.dn6 = dn6;
		this.chro_clsf6 = chro_clsf6;
		this.advt_cont6 = advt_cont6;
		this.uprc6 = uprc6;
		this.advt_fee6 = advt_fee6;
		this.slcrg_pers6 = slcrg_pers6;
		this.agn6 = agn6;
		this.dlco_clsf6 = dlco_clsf6;
		this.mode7 = mode7;
		this.preng_occr_seq7 = preng_occr_seq7;
		this.issu_side7 = issu_side7;
		this.sect_cd7 = sect_cd7;
		this.sect_seq7 = sect_seq7;
		this.cm7 = cm7;
		this.dn7 = dn7;
		this.chro_clsf7 = chro_clsf7;
		this.advt_cont7 = advt_cont7;
		this.uprc7 = uprc7;
		this.advt_fee7 = advt_fee7;
		this.slcrg_pers7 = slcrg_pers7;
		this.agn7 = agn7;
		this.dlco_clsf7 = dlco_clsf7;
		this.mode8 = mode8;
		this.preng_occr_seq8 = preng_occr_seq8;
		this.issu_side8 = issu_side8;
		this.sect_cd8 = sect_cd8;
		this.sect_seq8 = sect_seq8;
		this.cm8 = cm8;
		this.dn8 = dn8;
		this.chro_clsf8 = chro_clsf8;
		this.advt_cont8 = advt_cont8;
		this.uprc8 = uprc8;
		this.advt_fee8 = advt_fee8;
		this.slcrg_pers8 = slcrg_pers8;
		this.agn8 = agn8;
		this.dlco_clsf8 = dlco_clsf8;
		this.unasin_uprc = unasin_uprc;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setPubc_dt(String pubc_dt){
		this.pubc_dt = pubc_dt;
	}

	public void setMode0(String mode0){
		this.mode0 = mode0;
	}

	public void setPreng_occr_seq0(String preng_occr_seq0){
		this.preng_occr_seq0 = preng_occr_seq0;
	}

	public void setIssu_side0(String issu_side0){
		this.issu_side0 = issu_side0;
	}

	public void setSect_cd0(String sect_cd0){
		this.sect_cd0 = sect_cd0;
	}

	public void setSect_seq0(String sect_seq0){
		this.sect_seq0 = sect_seq0;
	}

	public void setCm0(String cm0){
		this.cm0 = cm0;
	}

	public void setDn0(String dn0){
		this.dn0 = dn0;
	}

	public void setChro_clsf0(String chro_clsf0){
		this.chro_clsf0 = chro_clsf0;
	}

	public void setAdvt_cont0(String advt_cont0){
		this.advt_cont0 = advt_cont0;
	}

	public void setUprc0(String uprc0){
		this.uprc0 = uprc0;
	}

	public void setAdvt_fee0(String advt_fee0){
		this.advt_fee0 = advt_fee0;
	}

	public void setSlcrg_pers0(String slcrg_pers0){
		this.slcrg_pers0 = slcrg_pers0;
	}

	public void setAgn0(String agn0){
		this.agn0 = agn0;
	}

	public void setDlco_clsf0(String dlco_clsf0){
		this.dlco_clsf0 = dlco_clsf0;
	}

	public void setMode1(String mode1){
		this.mode1 = mode1;
	}

	public void setPreng_occr_seq1(String preng_occr_seq1){
		this.preng_occr_seq1 = preng_occr_seq1;
	}

	public void setIssu_side1(String issu_side1){
		this.issu_side1 = issu_side1;
	}

	public void setSect_cd1(String sect_cd1){
		this.sect_cd1 = sect_cd1;
	}

	public void setSect_seq1(String sect_seq1){
		this.sect_seq1 = sect_seq1;
	}

	public void setCm1(String cm1){
		this.cm1 = cm1;
	}

	public void setDn1(String dn1){
		this.dn1 = dn1;
	}

	public void setChro_clsf1(String chro_clsf1){
		this.chro_clsf1 = chro_clsf1;
	}

	public void setAdvt_cont1(String advt_cont1){
		this.advt_cont1 = advt_cont1;
	}

	public void setUprc1(String uprc1){
		this.uprc1 = uprc1;
	}

	public void setAdvt_fee1(String advt_fee1){
		this.advt_fee1 = advt_fee1;
	}

	public void setSlcrg_pers1(String slcrg_pers1){
		this.slcrg_pers1 = slcrg_pers1;
	}

	public void setAgn1(String agn1){
		this.agn1 = agn1;
	}

	public void setDlco_clsf1(String dlco_clsf1){
		this.dlco_clsf1 = dlco_clsf1;
	}

	public void setMode2(String mode2){
		this.mode2 = mode2;
	}

	public void setPreng_occr_seq2(String preng_occr_seq2){
		this.preng_occr_seq2 = preng_occr_seq2;
	}

	public void setIssu_side2(String issu_side2){
		this.issu_side2 = issu_side2;
	}

	public void setSect_cd2(String sect_cd2){
		this.sect_cd2 = sect_cd2;
	}

	public void setSect_seq2(String sect_seq2){
		this.sect_seq2 = sect_seq2;
	}

	public void setCm2(String cm2){
		this.cm2 = cm2;
	}

	public void setDn2(String dn2){
		this.dn2 = dn2;
	}

	public void setChro_clsf2(String chro_clsf2){
		this.chro_clsf2 = chro_clsf2;
	}

	public void setAdvt_cont2(String advt_cont2){
		this.advt_cont2 = advt_cont2;
	}

	public void setUprc2(String uprc2){
		this.uprc2 = uprc2;
	}

	public void setAdvt_fee2(String advt_fee2){
		this.advt_fee2 = advt_fee2;
	}

	public void setSlcrg_pers2(String slcrg_pers2){
		this.slcrg_pers2 = slcrg_pers2;
	}

	public void setAgn2(String agn2){
		this.agn2 = agn2;
	}

	public void setDlco_clsf2(String dlco_clsf2){
		this.dlco_clsf2 = dlco_clsf2;
	}

	public void setMode3(String mode3){
		this.mode3 = mode3;
	}

	public void setPreng_occr_seq3(String preng_occr_seq3){
		this.preng_occr_seq3 = preng_occr_seq3;
	}

	public void setIssu_side3(String issu_side3){
		this.issu_side3 = issu_side3;
	}

	public void setSect_cd3(String sect_cd3){
		this.sect_cd3 = sect_cd3;
	}

	public void setSect_seq3(String sect_seq3){
		this.sect_seq3 = sect_seq3;
	}

	public void setCm3(String cm3){
		this.cm3 = cm3;
	}

	public void setDn3(String dn3){
		this.dn3 = dn3;
	}

	public void setChro_clsf3(String chro_clsf3){
		this.chro_clsf3 = chro_clsf3;
	}

	public void setAdvt_cont3(String advt_cont3){
		this.advt_cont3 = advt_cont3;
	}

	public void setUprc3(String uprc3){
		this.uprc3 = uprc3;
	}

	public void setAdvt_fee3(String advt_fee3){
		this.advt_fee3 = advt_fee3;
	}

	public void setSlcrg_pers3(String slcrg_pers3){
		this.slcrg_pers3 = slcrg_pers3;
	}

	public void setAgn3(String agn3){
		this.agn3 = agn3;
	}

	public void setDlco_clsf3(String dlco_clsf3){
		this.dlco_clsf3 = dlco_clsf3;
	}

	public void setMode4(String mode4){
		this.mode4 = mode4;
	}

	public void setPreng_occr_seq4(String preng_occr_seq4){
		this.preng_occr_seq4 = preng_occr_seq4;
	}

	public void setIssu_side4(String issu_side4){
		this.issu_side4 = issu_side4;
	}

	public void setSect_cd4(String sect_cd4){
		this.sect_cd4 = sect_cd4;
	}

	public void setSect_seq4(String sect_seq4){
		this.sect_seq4 = sect_seq4;
	}

	public void setCm4(String cm4){
		this.cm4 = cm4;
	}

	public void setDn4(String dn4){
		this.dn4 = dn4;
	}

	public void setChro_clsf4(String chro_clsf4){
		this.chro_clsf4 = chro_clsf4;
	}

	public void setAdvt_cont4(String advt_cont4){
		this.advt_cont4 = advt_cont4;
	}

	public void setUprc4(String uprc4){
		this.uprc4 = uprc4;
	}

	public void setAdvt_fee4(String advt_fee4){
		this.advt_fee4 = advt_fee4;
	}

	public void setSlcrg_pers4(String slcrg_pers4){
		this.slcrg_pers4 = slcrg_pers4;
	}

	public void setAgn4(String agn4){
		this.agn4 = agn4;
	}

	public void setDlco_clsf4(String dlco_clsf4){
		this.dlco_clsf4 = dlco_clsf4;
	}

	public void setMode5(String mode5){
		this.mode5 = mode5;
	}

	public void setPreng_occr_seq5(String preng_occr_seq5){
		this.preng_occr_seq5 = preng_occr_seq5;
	}

	public void setIssu_side5(String issu_side5){
		this.issu_side5 = issu_side5;
	}

	public void setSect_cd5(String sect_cd5){
		this.sect_cd5 = sect_cd5;
	}

	public void setSect_seq5(String sect_seq5){
		this.sect_seq5 = sect_seq5;
	}

	public void setCm5(String cm5){
		this.cm5 = cm5;
	}

	public void setDn5(String dn5){
		this.dn5 = dn5;
	}

	public void setChro_clsf5(String chro_clsf5){
		this.chro_clsf5 = chro_clsf5;
	}

	public void setAdvt_cont5(String advt_cont5){
		this.advt_cont5 = advt_cont5;
	}

	public void setUprc5(String uprc5){
		this.uprc5 = uprc5;
	}

	public void setAdvt_fee5(String advt_fee5){
		this.advt_fee5 = advt_fee5;
	}

	public void setSlcrg_pers5(String slcrg_pers5){
		this.slcrg_pers5 = slcrg_pers5;
	}

	public void setAgn5(String agn5){
		this.agn5 = agn5;
	}

	public void setDlco_clsf5(String dlco_clsf5){
		this.dlco_clsf5 = dlco_clsf5;
	}

	public void setMode6(String mode6){
		this.mode6 = mode6;
	}

	public void setPreng_occr_seq6(String preng_occr_seq6){
		this.preng_occr_seq6 = preng_occr_seq6;
	}

	public void setIssu_side6(String issu_side6){
		this.issu_side6 = issu_side6;
	}

	public void setSect_cd6(String sect_cd6){
		this.sect_cd6 = sect_cd6;
	}

	public void setSect_seq6(String sect_seq6){
		this.sect_seq6 = sect_seq6;
	}

	public void setCm6(String cm6){
		this.cm6 = cm6;
	}

	public void setDn6(String dn6){
		this.dn6 = dn6;
	}

	public void setChro_clsf6(String chro_clsf6){
		this.chro_clsf6 = chro_clsf6;
	}

	public void setAdvt_cont6(String advt_cont6){
		this.advt_cont6 = advt_cont6;
	}

	public void setUprc6(String uprc6){
		this.uprc6 = uprc6;
	}

	public void setAdvt_fee6(String advt_fee6){
		this.advt_fee6 = advt_fee6;
	}

	public void setSlcrg_pers6(String slcrg_pers6){
		this.slcrg_pers6 = slcrg_pers6;
	}

	public void setAgn6(String agn6){
		this.agn6 = agn6;
	}

	public void setDlco_clsf6(String dlco_clsf6){
		this.dlco_clsf6 = dlco_clsf6;
	}

	public void setMode7(String mode7){
		this.mode7 = mode7;
	}

	public void setPreng_occr_seq7(String preng_occr_seq7){
		this.preng_occr_seq7 = preng_occr_seq7;
	}

	public void setIssu_side7(String issu_side7){
		this.issu_side7 = issu_side7;
	}

	public void setSect_cd7(String sect_cd7){
		this.sect_cd7 = sect_cd7;
	}

	public void setSect_seq7(String sect_seq7){
		this.sect_seq7 = sect_seq7;
	}

	public void setCm7(String cm7){
		this.cm7 = cm7;
	}

	public void setDn7(String dn7){
		this.dn7 = dn7;
	}

	public void setChro_clsf7(String chro_clsf7){
		this.chro_clsf7 = chro_clsf7;
	}

	public void setAdvt_cont7(String advt_cont7){
		this.advt_cont7 = advt_cont7;
	}

	public void setUprc7(String uprc7){
		this.uprc7 = uprc7;
	}

	public void setAdvt_fee7(String advt_fee7){
		this.advt_fee7 = advt_fee7;
	}

	public void setSlcrg_pers7(String slcrg_pers7){
		this.slcrg_pers7 = slcrg_pers7;
	}

	public void setAgn7(String agn7){
		this.agn7 = agn7;
	}

	public void setDlco_clsf7(String dlco_clsf7){
		this.dlco_clsf7 = dlco_clsf7;
	}

	public void setMode8(String mode8){
		this.mode8 = mode8;
	}

	public void setPreng_occr_seq8(String preng_occr_seq8){
		this.preng_occr_seq8 = preng_occr_seq8;
	}

	public void setIssu_side8(String issu_side8){
		this.issu_side8 = issu_side8;
	}

	public void setSect_cd8(String sect_cd8){
		this.sect_cd8 = sect_cd8;
	}

	public void setSect_seq8(String sect_seq8){
		this.sect_seq8 = sect_seq8;
	}

	public void setCm8(String cm8){
		this.cm8 = cm8;
	}

	public void setDn8(String dn8){
		this.dn8 = dn8;
	}

	public void setChro_clsf8(String chro_clsf8){
		this.chro_clsf8 = chro_clsf8;
	}

	public void setAdvt_cont8(String advt_cont8){
		this.advt_cont8 = advt_cont8;
	}

	public void setUprc8(String uprc8){
		this.uprc8 = uprc8;
	}

	public void setAdvt_fee8(String advt_fee8){
		this.advt_fee8 = advt_fee8;
	}

	public void setSlcrg_pers8(String slcrg_pers8){
		this.slcrg_pers8 = slcrg_pers8;
	}

	public void setAgn8(String agn8){
		this.agn8 = agn8;
	}

	public void setDlco_clsf8(String dlco_clsf8){
		this.dlco_clsf8 = dlco_clsf8;
	}

	public void setUnasin_uprc(String unasin_uprc){
		this.unasin_uprc = unasin_uprc;
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

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getPubc_dt(){
		return this.pubc_dt;
	}

	public String getMode0(){
		return this.mode0;
	}

	public String getPreng_occr_seq0(){
		return this.preng_occr_seq0;
	}

	public String getIssu_side0(){
		return this.issu_side0;
	}

	public String getSect_cd0(){
		return this.sect_cd0;
	}

	public String getSect_seq0(){
		return this.sect_seq0;
	}

	public String getCm0(){
		return this.cm0;
	}

	public String getDn0(){
		return this.dn0;
	}

	public String getChro_clsf0(){
		return this.chro_clsf0;
	}

	public String getAdvt_cont0(){
		return this.advt_cont0;
	}

	public String getUprc0(){
		return this.uprc0;
	}

	public String getAdvt_fee0(){
		return this.advt_fee0;
	}

	public String getSlcrg_pers0(){
		return this.slcrg_pers0;
	}

	public String getAgn0(){
		return this.agn0;
	}

	public String getDlco_clsf0(){
		return this.dlco_clsf0;
	}

	public String getMode1(){
		return this.mode1;
	}

	public String getPreng_occr_seq1(){
		return this.preng_occr_seq1;
	}

	public String getIssu_side1(){
		return this.issu_side1;
	}

	public String getSect_cd1(){
		return this.sect_cd1;
	}

	public String getSect_seq1(){
		return this.sect_seq1;
	}

	public String getCm1(){
		return this.cm1;
	}

	public String getDn1(){
		return this.dn1;
	}

	public String getChro_clsf1(){
		return this.chro_clsf1;
	}

	public String getAdvt_cont1(){
		return this.advt_cont1;
	}

	public String getUprc1(){
		return this.uprc1;
	}

	public String getAdvt_fee1(){
		return this.advt_fee1;
	}

	public String getSlcrg_pers1(){
		return this.slcrg_pers1;
	}

	public String getAgn1(){
		return this.agn1;
	}

	public String getDlco_clsf1(){
		return this.dlco_clsf1;
	}

	public String getMode2(){
		return this.mode2;
	}

	public String getPreng_occr_seq2(){
		return this.preng_occr_seq2;
	}

	public String getIssu_side2(){
		return this.issu_side2;
	}

	public String getSect_cd2(){
		return this.sect_cd2;
	}

	public String getSect_seq2(){
		return this.sect_seq2;
	}

	public String getCm2(){
		return this.cm2;
	}

	public String getDn2(){
		return this.dn2;
	}

	public String getChro_clsf2(){
		return this.chro_clsf2;
	}

	public String getAdvt_cont2(){
		return this.advt_cont2;
	}

	public String getUprc2(){
		return this.uprc2;
	}

	public String getAdvt_fee2(){
		return this.advt_fee2;
	}

	public String getSlcrg_pers2(){
		return this.slcrg_pers2;
	}

	public String getAgn2(){
		return this.agn2;
	}

	public String getDlco_clsf2(){
		return this.dlco_clsf2;
	}

	public String getMode3(){
		return this.mode3;
	}

	public String getPreng_occr_seq3(){
		return this.preng_occr_seq3;
	}

	public String getIssu_side3(){
		return this.issu_side3;
	}

	public String getSect_cd3(){
		return this.sect_cd3;
	}

	public String getSect_seq3(){
		return this.sect_seq3;
	}

	public String getCm3(){
		return this.cm3;
	}

	public String getDn3(){
		return this.dn3;
	}

	public String getChro_clsf3(){
		return this.chro_clsf3;
	}

	public String getAdvt_cont3(){
		return this.advt_cont3;
	}

	public String getUprc3(){
		return this.uprc3;
	}

	public String getAdvt_fee3(){
		return this.advt_fee3;
	}

	public String getSlcrg_pers3(){
		return this.slcrg_pers3;
	}

	public String getAgn3(){
		return this.agn3;
	}

	public String getDlco_clsf3(){
		return this.dlco_clsf3;
	}

	public String getMode4(){
		return this.mode4;
	}

	public String getPreng_occr_seq4(){
		return this.preng_occr_seq4;
	}

	public String getIssu_side4(){
		return this.issu_side4;
	}

	public String getSect_cd4(){
		return this.sect_cd4;
	}

	public String getSect_seq4(){
		return this.sect_seq4;
	}

	public String getCm4(){
		return this.cm4;
	}

	public String getDn4(){
		return this.dn4;
	}

	public String getChro_clsf4(){
		return this.chro_clsf4;
	}

	public String getAdvt_cont4(){
		return this.advt_cont4;
	}

	public String getUprc4(){
		return this.uprc4;
	}

	public String getAdvt_fee4(){
		return this.advt_fee4;
	}

	public String getSlcrg_pers4(){
		return this.slcrg_pers4;
	}

	public String getAgn4(){
		return this.agn4;
	}

	public String getDlco_clsf4(){
		return this.dlco_clsf4;
	}

	public String getMode5(){
		return this.mode5;
	}

	public String getPreng_occr_seq5(){
		return this.preng_occr_seq5;
	}

	public String getIssu_side5(){
		return this.issu_side5;
	}

	public String getSect_cd5(){
		return this.sect_cd5;
	}

	public String getSect_seq5(){
		return this.sect_seq5;
	}

	public String getCm5(){
		return this.cm5;
	}

	public String getDn5(){
		return this.dn5;
	}

	public String getChro_clsf5(){
		return this.chro_clsf5;
	}

	public String getAdvt_cont5(){
		return this.advt_cont5;
	}

	public String getUprc5(){
		return this.uprc5;
	}

	public String getAdvt_fee5(){
		return this.advt_fee5;
	}

	public String getSlcrg_pers5(){
		return this.slcrg_pers5;
	}

	public String getAgn5(){
		return this.agn5;
	}

	public String getDlco_clsf5(){
		return this.dlco_clsf5;
	}

	public String getMode6(){
		return this.mode6;
	}

	public String getPreng_occr_seq6(){
		return this.preng_occr_seq6;
	}

	public String getIssu_side6(){
		return this.issu_side6;
	}

	public String getSect_cd6(){
		return this.sect_cd6;
	}

	public String getSect_seq6(){
		return this.sect_seq6;
	}

	public String getCm6(){
		return this.cm6;
	}

	public String getDn6(){
		return this.dn6;
	}

	public String getChro_clsf6(){
		return this.chro_clsf6;
	}

	public String getAdvt_cont6(){
		return this.advt_cont6;
	}

	public String getUprc6(){
		return this.uprc6;
	}

	public String getAdvt_fee6(){
		return this.advt_fee6;
	}

	public String getSlcrg_pers6(){
		return this.slcrg_pers6;
	}

	public String getAgn6(){
		return this.agn6;
	}

	public String getDlco_clsf6(){
		return this.dlco_clsf6;
	}

	public String getMode7(){
		return this.mode7;
	}

	public String getPreng_occr_seq7(){
		return this.preng_occr_seq7;
	}

	public String getIssu_side7(){
		return this.issu_side7;
	}

	public String getSect_cd7(){
		return this.sect_cd7;
	}

	public String getSect_seq7(){
		return this.sect_seq7;
	}

	public String getCm7(){
		return this.cm7;
	}

	public String getDn7(){
		return this.dn7;
	}

	public String getChro_clsf7(){
		return this.chro_clsf7;
	}

	public String getAdvt_cont7(){
		return this.advt_cont7;
	}

	public String getUprc7(){
		return this.uprc7;
	}

	public String getAdvt_fee7(){
		return this.advt_fee7;
	}

	public String getSlcrg_pers7(){
		return this.slcrg_pers7;
	}

	public String getAgn7(){
		return this.agn7;
	}

	public String getDlco_clsf7(){
		return this.dlco_clsf7;
	}

	public String getMode8(){
		return this.mode8;
	}

	public String getPreng_occr_seq8(){
		return this.preng_occr_seq8;
	}

	public String getIssu_side8(){
		return this.issu_side8;
	}

	public String getSect_cd8(){
		return this.sect_cd8;
	}

	public String getSect_seq8(){
		return this.sect_seq8;
	}

	public String getCm8(){
		return this.cm8;
	}

	public String getDn8(){
		return this.dn8;
	}

	public String getChro_clsf8(){
		return this.chro_clsf8;
	}

	public String getAdvt_cont8(){
		return this.advt_cont8;
	}

	public String getUprc8(){
		return this.uprc8;
	}

	public String getAdvt_fee8(){
		return this.advt_fee8;
	}

	public String getSlcrg_pers8(){
		return this.slcrg_pers8;
	}

	public String getAgn8(){
		return this.agn8;
	}

	public String getDlco_clsf8(){
		return this.dlco_clsf8;
	}

	public String getUnasin_uprc(){
		return this.unasin_uprc;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_RES_1430_U(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_RES_1430_UDM dm = (AD_RES_1430_UDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.medi_cd);
		cstmt.setString(5, dm.pubc_dt);
		cstmt.setString(6, dm.mode0);
		cstmt.setString(7, dm.preng_occr_seq0);
		cstmt.setString(8, dm.issu_side0);
		cstmt.setString(9, dm.sect_cd0);
		cstmt.setString(10, dm.sect_seq0);
		cstmt.setString(11, dm.cm0);
		cstmt.setString(12, dm.dn0);
		cstmt.setString(13, dm.chro_clsf0);
		cstmt.setString(14, dm.advt_cont0);
		cstmt.setString(15, dm.uprc0);
		cstmt.setString(16, dm.advt_fee0);
		cstmt.setString(17, dm.slcrg_pers0);
		cstmt.setString(18, dm.agn0);
		cstmt.setString(19, dm.dlco_clsf0);
		cstmt.setString(20, dm.mode1);
		cstmt.setString(21, dm.preng_occr_seq1);
		cstmt.setString(22, dm.issu_side1);
		cstmt.setString(23, dm.sect_cd1);
		cstmt.setString(24, dm.sect_seq1);
		cstmt.setString(25, dm.cm1);
		cstmt.setString(26, dm.dn1);
		cstmt.setString(27, dm.chro_clsf1);
		cstmt.setString(28, dm.advt_cont1);
		cstmt.setString(29, dm.uprc1);
		cstmt.setString(30, dm.advt_fee1);
		cstmt.setString(31, dm.slcrg_pers1);
		cstmt.setString(32, dm.agn1);
		cstmt.setString(33, dm.dlco_clsf1);
		cstmt.setString(34, dm.mode2);
		cstmt.setString(35, dm.preng_occr_seq2);
		cstmt.setString(36, dm.issu_side2);
		cstmt.setString(37, dm.sect_cd2);
		cstmt.setString(38, dm.sect_seq2);
		cstmt.setString(39, dm.cm2);
		cstmt.setString(40, dm.dn2);
		cstmt.setString(41, dm.chro_clsf2);
		cstmt.setString(42, dm.advt_cont2);
		cstmt.setString(43, dm.uprc2);
		cstmt.setString(44, dm.advt_fee2);
		cstmt.setString(45, dm.slcrg_pers2);
		cstmt.setString(46, dm.agn2);
		cstmt.setString(47, dm.dlco_clsf2);
		cstmt.setString(48, dm.mode3);
		cstmt.setString(49, dm.preng_occr_seq3);
		cstmt.setString(50, dm.issu_side3);
		cstmt.setString(51, dm.sect_cd3);
		cstmt.setString(52, dm.sect_seq3);
		cstmt.setString(53, dm.cm3);
		cstmt.setString(54, dm.dn3);
		cstmt.setString(55, dm.chro_clsf3);
		cstmt.setString(56, dm.advt_cont3);
		cstmt.setString(57, dm.uprc3);
		cstmt.setString(58, dm.advt_fee3);
		cstmt.setString(59, dm.slcrg_pers3);
		cstmt.setString(60, dm.agn3);
		cstmt.setString(61, dm.dlco_clsf3);
		cstmt.setString(62, dm.mode4);
		cstmt.setString(63, dm.preng_occr_seq4);
		cstmt.setString(64, dm.issu_side4);
		cstmt.setString(65, dm.sect_cd4);
		cstmt.setString(66, dm.sect_seq4);
		cstmt.setString(67, dm.cm4);
		cstmt.setString(68, dm.dn4);
		cstmt.setString(69, dm.chro_clsf4);
		cstmt.setString(70, dm.advt_cont4);
		cstmt.setString(71, dm.uprc4);
		cstmt.setString(72, dm.advt_fee4);
		cstmt.setString(73, dm.slcrg_pers4);
		cstmt.setString(74, dm.agn4);
		cstmt.setString(75, dm.dlco_clsf4);
		cstmt.setString(76, dm.mode5);
		cstmt.setString(77, dm.preng_occr_seq5);
		cstmt.setString(78, dm.issu_side5);
		cstmt.setString(79, dm.sect_cd5);
		cstmt.setString(80, dm.sect_seq5);
		cstmt.setString(81, dm.cm5);
		cstmt.setString(82, dm.dn5);
		cstmt.setString(83, dm.chro_clsf5);
		cstmt.setString(84, dm.advt_cont5);
		cstmt.setString(85, dm.uprc5);
		cstmt.setString(86, dm.advt_fee5);
		cstmt.setString(87, dm.slcrg_pers5);
		cstmt.setString(88, dm.agn5);
		cstmt.setString(89, dm.dlco_clsf5);
		cstmt.setString(90, dm.mode6);
		cstmt.setString(91, dm.preng_occr_seq6);
		cstmt.setString(92, dm.issu_side6);
		cstmt.setString(93, dm.sect_cd6);
		cstmt.setString(94, dm.sect_seq6);
		cstmt.setString(95, dm.cm6);
		cstmt.setString(96, dm.dn6);
		cstmt.setString(97, dm.chro_clsf6);
		cstmt.setString(98, dm.advt_cont6);
		cstmt.setString(99, dm.uprc6);
		cstmt.setString(100, dm.advt_fee6);
		cstmt.setString(101, dm.slcrg_pers6);
		cstmt.setString(102, dm.agn6);
		cstmt.setString(103, dm.dlco_clsf6);
		cstmt.setString(104, dm.mode7);
		cstmt.setString(105, dm.preng_occr_seq7);
		cstmt.setString(106, dm.issu_side7);
		cstmt.setString(107, dm.sect_cd7);
		cstmt.setString(108, dm.sect_seq7);
		cstmt.setString(109, dm.cm7);
		cstmt.setString(110, dm.dn7);
		cstmt.setString(111, dm.chro_clsf7);
		cstmt.setString(112, dm.advt_cont7);
		cstmt.setString(113, dm.uprc7);
		cstmt.setString(114, dm.advt_fee7);
		cstmt.setString(115, dm.slcrg_pers7);
		cstmt.setString(116, dm.agn7);
		cstmt.setString(117, dm.dlco_clsf7);
		cstmt.setString(118, dm.mode8);
		cstmt.setString(119, dm.preng_occr_seq8);
		cstmt.setString(120, dm.issu_side8);
		cstmt.setString(121, dm.sect_cd8);
		cstmt.setString(122, dm.sect_seq8);
		cstmt.setString(123, dm.cm8);
		cstmt.setString(124, dm.dn8);
		cstmt.setString(125, dm.chro_clsf8);
		cstmt.setString(126, dm.advt_cont8);
		cstmt.setString(127, dm.uprc8);
		cstmt.setString(128, dm.advt_fee8);
		cstmt.setString(129, dm.slcrg_pers8);
		cstmt.setString(130, dm.agn8);
		cstmt.setString(131, dm.dlco_clsf8);
		cstmt.setString(132, dm.unasin_uprc);
		cstmt.setString(133, dm.incmg_pers_ip);
		cstmt.setString(134, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.res.ds.AD_RES_1430_UDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("pubc_dt = [" + getPubc_dt() + "]");
		System.out.println("mode0 = [" + getMode0() + "]");
		System.out.println("preng_occr_seq0 = [" + getPreng_occr_seq0() + "]");
		System.out.println("issu_side0 = [" + getIssu_side0() + "]");
		System.out.println("sect_cd0 = [" + getSect_cd0() + "]");
		System.out.println("sect_seq0 = [" + getSect_seq0() + "]");
		System.out.println("cm0 = [" + getCm0() + "]");
		System.out.println("dn0 = [" + getDn0() + "]");
		System.out.println("chro_clsf0 = [" + getChro_clsf0() + "]");
		System.out.println("advt_cont0 = [" + getAdvt_cont0() + "]");
		System.out.println("uprc0 = [" + getUprc0() + "]");
		System.out.println("advt_fee0 = [" + getAdvt_fee0() + "]");
		System.out.println("slcrg_pers0 = [" + getSlcrg_pers0() + "]");
		System.out.println("agn0 = [" + getAgn0() + "]");
		System.out.println("dlco_clsf0 = [" + getDlco_clsf0() + "]");
		System.out.println("mode1 = [" + getMode1() + "]");
		System.out.println("preng_occr_seq1 = [" + getPreng_occr_seq1() + "]");
		System.out.println("issu_side1 = [" + getIssu_side1() + "]");
		System.out.println("sect_cd1 = [" + getSect_cd1() + "]");
		System.out.println("sect_seq1 = [" + getSect_seq1() + "]");
		System.out.println("cm1 = [" + getCm1() + "]");
		System.out.println("dn1 = [" + getDn1() + "]");
		System.out.println("chro_clsf1 = [" + getChro_clsf1() + "]");
		System.out.println("advt_cont1 = [" + getAdvt_cont1() + "]");
		System.out.println("uprc1 = [" + getUprc1() + "]");
		System.out.println("advt_fee1 = [" + getAdvt_fee1() + "]");
		System.out.println("slcrg_pers1 = [" + getSlcrg_pers1() + "]");
		System.out.println("agn1 = [" + getAgn1() + "]");
		System.out.println("dlco_clsf1 = [" + getDlco_clsf1() + "]");
		System.out.println("mode2 = [" + getMode2() + "]");
		System.out.println("preng_occr_seq2 = [" + getPreng_occr_seq2() + "]");
		System.out.println("issu_side2 = [" + getIssu_side2() + "]");
		System.out.println("sect_cd2 = [" + getSect_cd2() + "]");
		System.out.println("sect_seq2 = [" + getSect_seq2() + "]");
		System.out.println("cm2 = [" + getCm2() + "]");
		System.out.println("dn2 = [" + getDn2() + "]");
		System.out.println("chro_clsf2 = [" + getChro_clsf2() + "]");
		System.out.println("advt_cont2 = [" + getAdvt_cont2() + "]");
		System.out.println("uprc2 = [" + getUprc2() + "]");
		System.out.println("advt_fee2 = [" + getAdvt_fee2() + "]");
		System.out.println("slcrg_pers2 = [" + getSlcrg_pers2() + "]");
		System.out.println("agn2 = [" + getAgn2() + "]");
		System.out.println("dlco_clsf2 = [" + getDlco_clsf2() + "]");
		System.out.println("mode3 = [" + getMode3() + "]");
		System.out.println("preng_occr_seq3 = [" + getPreng_occr_seq3() + "]");
		System.out.println("issu_side3 = [" + getIssu_side3() + "]");
		System.out.println("sect_cd3 = [" + getSect_cd3() + "]");
		System.out.println("sect_seq3 = [" + getSect_seq3() + "]");
		System.out.println("cm3 = [" + getCm3() + "]");
		System.out.println("dn3 = [" + getDn3() + "]");
		System.out.println("chro_clsf3 = [" + getChro_clsf3() + "]");
		System.out.println("advt_cont3 = [" + getAdvt_cont3() + "]");
		System.out.println("uprc3 = [" + getUprc3() + "]");
		System.out.println("advt_fee3 = [" + getAdvt_fee3() + "]");
		System.out.println("slcrg_pers3 = [" + getSlcrg_pers3() + "]");
		System.out.println("agn3 = [" + getAgn3() + "]");
		System.out.println("dlco_clsf3 = [" + getDlco_clsf3() + "]");
		System.out.println("mode4 = [" + getMode4() + "]");
		System.out.println("preng_occr_seq4 = [" + getPreng_occr_seq4() + "]");
		System.out.println("issu_side4 = [" + getIssu_side4() + "]");
		System.out.println("sect_cd4 = [" + getSect_cd4() + "]");
		System.out.println("sect_seq4 = [" + getSect_seq4() + "]");
		System.out.println("cm4 = [" + getCm4() + "]");
		System.out.println("dn4 = [" + getDn4() + "]");
		System.out.println("chro_clsf4 = [" + getChro_clsf4() + "]");
		System.out.println("advt_cont4 = [" + getAdvt_cont4() + "]");
		System.out.println("uprc4 = [" + getUprc4() + "]");
		System.out.println("advt_fee4 = [" + getAdvt_fee4() + "]");
		System.out.println("slcrg_pers4 = [" + getSlcrg_pers4() + "]");
		System.out.println("agn4 = [" + getAgn4() + "]");
		System.out.println("dlco_clsf4 = [" + getDlco_clsf4() + "]");
		System.out.println("mode5 = [" + getMode5() + "]");
		System.out.println("preng_occr_seq5 = [" + getPreng_occr_seq5() + "]");
		System.out.println("issu_side5 = [" + getIssu_side5() + "]");
		System.out.println("sect_cd5 = [" + getSect_cd5() + "]");
		System.out.println("sect_seq5 = [" + getSect_seq5() + "]");
		System.out.println("cm5 = [" + getCm5() + "]");
		System.out.println("dn5 = [" + getDn5() + "]");
		System.out.println("chro_clsf5 = [" + getChro_clsf5() + "]");
		System.out.println("advt_cont5 = [" + getAdvt_cont5() + "]");
		System.out.println("uprc5 = [" + getUprc5() + "]");
		System.out.println("advt_fee5 = [" + getAdvt_fee5() + "]");
		System.out.println("slcrg_pers5 = [" + getSlcrg_pers5() + "]");
		System.out.println("agn5 = [" + getAgn5() + "]");
		System.out.println("dlco_clsf5 = [" + getDlco_clsf5() + "]");
		System.out.println("mode6 = [" + getMode6() + "]");
		System.out.println("preng_occr_seq6 = [" + getPreng_occr_seq6() + "]");
		System.out.println("issu_side6 = [" + getIssu_side6() + "]");
		System.out.println("sect_cd6 = [" + getSect_cd6() + "]");
		System.out.println("sect_seq6 = [" + getSect_seq6() + "]");
		System.out.println("cm6 = [" + getCm6() + "]");
		System.out.println("dn6 = [" + getDn6() + "]");
		System.out.println("chro_clsf6 = [" + getChro_clsf6() + "]");
		System.out.println("advt_cont6 = [" + getAdvt_cont6() + "]");
		System.out.println("uprc6 = [" + getUprc6() + "]");
		System.out.println("advt_fee6 = [" + getAdvt_fee6() + "]");
		System.out.println("slcrg_pers6 = [" + getSlcrg_pers6() + "]");
		System.out.println("agn6 = [" + getAgn6() + "]");
		System.out.println("dlco_clsf6 = [" + getDlco_clsf6() + "]");
		System.out.println("mode7 = [" + getMode7() + "]");
		System.out.println("preng_occr_seq7 = [" + getPreng_occr_seq7() + "]");
		System.out.println("issu_side7 = [" + getIssu_side7() + "]");
		System.out.println("sect_cd7 = [" + getSect_cd7() + "]");
		System.out.println("sect_seq7 = [" + getSect_seq7() + "]");
		System.out.println("cm7 = [" + getCm7() + "]");
		System.out.println("dn7 = [" + getDn7() + "]");
		System.out.println("chro_clsf7 = [" + getChro_clsf7() + "]");
		System.out.println("advt_cont7 = [" + getAdvt_cont7() + "]");
		System.out.println("uprc7 = [" + getUprc7() + "]");
		System.out.println("advt_fee7 = [" + getAdvt_fee7() + "]");
		System.out.println("slcrg_pers7 = [" + getSlcrg_pers7() + "]");
		System.out.println("agn7 = [" + getAgn7() + "]");
		System.out.println("dlco_clsf7 = [" + getDlco_clsf7() + "]");
		System.out.println("mode8 = [" + getMode8() + "]");
		System.out.println("preng_occr_seq8 = [" + getPreng_occr_seq8() + "]");
		System.out.println("issu_side8 = [" + getIssu_side8() + "]");
		System.out.println("sect_cd8 = [" + getSect_cd8() + "]");
		System.out.println("sect_seq8 = [" + getSect_seq8() + "]");
		System.out.println("cm8 = [" + getCm8() + "]");
		System.out.println("dn8 = [" + getDn8() + "]");
		System.out.println("chro_clsf8 = [" + getChro_clsf8() + "]");
		System.out.println("advt_cont8 = [" + getAdvt_cont8() + "]");
		System.out.println("uprc8 = [" + getUprc8() + "]");
		System.out.println("advt_fee8 = [" + getAdvt_fee8() + "]");
		System.out.println("slcrg_pers8 = [" + getSlcrg_pers8() + "]");
		System.out.println("agn8 = [" + getAgn8() + "]");
		System.out.println("dlco_clsf8 = [" + getDlco_clsf8() + "]");
		System.out.println("unasin_uprc = [" + getUnasin_uprc() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
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
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String pubc_dt = req.getParameter("pubc_dt");
if( pubc_dt == null){
	System.out.println(this.toString+" : pubc_dt is null" );
}else{
	System.out.println(this.toString+" : pubc_dt is "+pubc_dt );
}
String mode0 = req.getParameter("mode0");
if( mode0 == null){
	System.out.println(this.toString+" : mode0 is null" );
}else{
	System.out.println(this.toString+" : mode0 is "+mode0 );
}
String preng_occr_seq0 = req.getParameter("preng_occr_seq0");
if( preng_occr_seq0 == null){
	System.out.println(this.toString+" : preng_occr_seq0 is null" );
}else{
	System.out.println(this.toString+" : preng_occr_seq0 is "+preng_occr_seq0 );
}
String issu_side0 = req.getParameter("issu_side0");
if( issu_side0 == null){
	System.out.println(this.toString+" : issu_side0 is null" );
}else{
	System.out.println(this.toString+" : issu_side0 is "+issu_side0 );
}
String sect_cd0 = req.getParameter("sect_cd0");
if( sect_cd0 == null){
	System.out.println(this.toString+" : sect_cd0 is null" );
}else{
	System.out.println(this.toString+" : sect_cd0 is "+sect_cd0 );
}
String sect_seq0 = req.getParameter("sect_seq0");
if( sect_seq0 == null){
	System.out.println(this.toString+" : sect_seq0 is null" );
}else{
	System.out.println(this.toString+" : sect_seq0 is "+sect_seq0 );
}
String cm0 = req.getParameter("cm0");
if( cm0 == null){
	System.out.println(this.toString+" : cm0 is null" );
}else{
	System.out.println(this.toString+" : cm0 is "+cm0 );
}
String dn0 = req.getParameter("dn0");
if( dn0 == null){
	System.out.println(this.toString+" : dn0 is null" );
}else{
	System.out.println(this.toString+" : dn0 is "+dn0 );
}
String chro_clsf0 = req.getParameter("chro_clsf0");
if( chro_clsf0 == null){
	System.out.println(this.toString+" : chro_clsf0 is null" );
}else{
	System.out.println(this.toString+" : chro_clsf0 is "+chro_clsf0 );
}
String advt_cont0 = req.getParameter("advt_cont0");
if( advt_cont0 == null){
	System.out.println(this.toString+" : advt_cont0 is null" );
}else{
	System.out.println(this.toString+" : advt_cont0 is "+advt_cont0 );
}
String uprc0 = req.getParameter("uprc0");
if( uprc0 == null){
	System.out.println(this.toString+" : uprc0 is null" );
}else{
	System.out.println(this.toString+" : uprc0 is "+uprc0 );
}
String advt_fee0 = req.getParameter("advt_fee0");
if( advt_fee0 == null){
	System.out.println(this.toString+" : advt_fee0 is null" );
}else{
	System.out.println(this.toString+" : advt_fee0 is "+advt_fee0 );
}
String slcrg_pers0 = req.getParameter("slcrg_pers0");
if( slcrg_pers0 == null){
	System.out.println(this.toString+" : slcrg_pers0 is null" );
}else{
	System.out.println(this.toString+" : slcrg_pers0 is "+slcrg_pers0 );
}
String agn0 = req.getParameter("agn0");
if( agn0 == null){
	System.out.println(this.toString+" : agn0 is null" );
}else{
	System.out.println(this.toString+" : agn0 is "+agn0 );
}
String dlco_clsf0 = req.getParameter("dlco_clsf0");
if( dlco_clsf0 == null){
	System.out.println(this.toString+" : dlco_clsf0 is null" );
}else{
	System.out.println(this.toString+" : dlco_clsf0 is "+dlco_clsf0 );
}
String mode1 = req.getParameter("mode1");
if( mode1 == null){
	System.out.println(this.toString+" : mode1 is null" );
}else{
	System.out.println(this.toString+" : mode1 is "+mode1 );
}
String preng_occr_seq1 = req.getParameter("preng_occr_seq1");
if( preng_occr_seq1 == null){
	System.out.println(this.toString+" : preng_occr_seq1 is null" );
}else{
	System.out.println(this.toString+" : preng_occr_seq1 is "+preng_occr_seq1 );
}
String issu_side1 = req.getParameter("issu_side1");
if( issu_side1 == null){
	System.out.println(this.toString+" : issu_side1 is null" );
}else{
	System.out.println(this.toString+" : issu_side1 is "+issu_side1 );
}
String sect_cd1 = req.getParameter("sect_cd1");
if( sect_cd1 == null){
	System.out.println(this.toString+" : sect_cd1 is null" );
}else{
	System.out.println(this.toString+" : sect_cd1 is "+sect_cd1 );
}
String sect_seq1 = req.getParameter("sect_seq1");
if( sect_seq1 == null){
	System.out.println(this.toString+" : sect_seq1 is null" );
}else{
	System.out.println(this.toString+" : sect_seq1 is "+sect_seq1 );
}
String cm1 = req.getParameter("cm1");
if( cm1 == null){
	System.out.println(this.toString+" : cm1 is null" );
}else{
	System.out.println(this.toString+" : cm1 is "+cm1 );
}
String dn1 = req.getParameter("dn1");
if( dn1 == null){
	System.out.println(this.toString+" : dn1 is null" );
}else{
	System.out.println(this.toString+" : dn1 is "+dn1 );
}
String chro_clsf1 = req.getParameter("chro_clsf1");
if( chro_clsf1 == null){
	System.out.println(this.toString+" : chro_clsf1 is null" );
}else{
	System.out.println(this.toString+" : chro_clsf1 is "+chro_clsf1 );
}
String advt_cont1 = req.getParameter("advt_cont1");
if( advt_cont1 == null){
	System.out.println(this.toString+" : advt_cont1 is null" );
}else{
	System.out.println(this.toString+" : advt_cont1 is "+advt_cont1 );
}
String uprc1 = req.getParameter("uprc1");
if( uprc1 == null){
	System.out.println(this.toString+" : uprc1 is null" );
}else{
	System.out.println(this.toString+" : uprc1 is "+uprc1 );
}
String advt_fee1 = req.getParameter("advt_fee1");
if( advt_fee1 == null){
	System.out.println(this.toString+" : advt_fee1 is null" );
}else{
	System.out.println(this.toString+" : advt_fee1 is "+advt_fee1 );
}
String slcrg_pers1 = req.getParameter("slcrg_pers1");
if( slcrg_pers1 == null){
	System.out.println(this.toString+" : slcrg_pers1 is null" );
}else{
	System.out.println(this.toString+" : slcrg_pers1 is "+slcrg_pers1 );
}
String agn1 = req.getParameter("agn1");
if( agn1 == null){
	System.out.println(this.toString+" : agn1 is null" );
}else{
	System.out.println(this.toString+" : agn1 is "+agn1 );
}
String dlco_clsf1 = req.getParameter("dlco_clsf1");
if( dlco_clsf1 == null){
	System.out.println(this.toString+" : dlco_clsf1 is null" );
}else{
	System.out.println(this.toString+" : dlco_clsf1 is "+dlco_clsf1 );
}
String mode2 = req.getParameter("mode2");
if( mode2 == null){
	System.out.println(this.toString+" : mode2 is null" );
}else{
	System.out.println(this.toString+" : mode2 is "+mode2 );
}
String preng_occr_seq2 = req.getParameter("preng_occr_seq2");
if( preng_occr_seq2 == null){
	System.out.println(this.toString+" : preng_occr_seq2 is null" );
}else{
	System.out.println(this.toString+" : preng_occr_seq2 is "+preng_occr_seq2 );
}
String issu_side2 = req.getParameter("issu_side2");
if( issu_side2 == null){
	System.out.println(this.toString+" : issu_side2 is null" );
}else{
	System.out.println(this.toString+" : issu_side2 is "+issu_side2 );
}
String sect_cd2 = req.getParameter("sect_cd2");
if( sect_cd2 == null){
	System.out.println(this.toString+" : sect_cd2 is null" );
}else{
	System.out.println(this.toString+" : sect_cd2 is "+sect_cd2 );
}
String sect_seq2 = req.getParameter("sect_seq2");
if( sect_seq2 == null){
	System.out.println(this.toString+" : sect_seq2 is null" );
}else{
	System.out.println(this.toString+" : sect_seq2 is "+sect_seq2 );
}
String cm2 = req.getParameter("cm2");
if( cm2 == null){
	System.out.println(this.toString+" : cm2 is null" );
}else{
	System.out.println(this.toString+" : cm2 is "+cm2 );
}
String dn2 = req.getParameter("dn2");
if( dn2 == null){
	System.out.println(this.toString+" : dn2 is null" );
}else{
	System.out.println(this.toString+" : dn2 is "+dn2 );
}
String chro_clsf2 = req.getParameter("chro_clsf2");
if( chro_clsf2 == null){
	System.out.println(this.toString+" : chro_clsf2 is null" );
}else{
	System.out.println(this.toString+" : chro_clsf2 is "+chro_clsf2 );
}
String advt_cont2 = req.getParameter("advt_cont2");
if( advt_cont2 == null){
	System.out.println(this.toString+" : advt_cont2 is null" );
}else{
	System.out.println(this.toString+" : advt_cont2 is "+advt_cont2 );
}
String uprc2 = req.getParameter("uprc2");
if( uprc2 == null){
	System.out.println(this.toString+" : uprc2 is null" );
}else{
	System.out.println(this.toString+" : uprc2 is "+uprc2 );
}
String advt_fee2 = req.getParameter("advt_fee2");
if( advt_fee2 == null){
	System.out.println(this.toString+" : advt_fee2 is null" );
}else{
	System.out.println(this.toString+" : advt_fee2 is "+advt_fee2 );
}
String slcrg_pers2 = req.getParameter("slcrg_pers2");
if( slcrg_pers2 == null){
	System.out.println(this.toString+" : slcrg_pers2 is null" );
}else{
	System.out.println(this.toString+" : slcrg_pers2 is "+slcrg_pers2 );
}
String agn2 = req.getParameter("agn2");
if( agn2 == null){
	System.out.println(this.toString+" : agn2 is null" );
}else{
	System.out.println(this.toString+" : agn2 is "+agn2 );
}
String dlco_clsf2 = req.getParameter("dlco_clsf2");
if( dlco_clsf2 == null){
	System.out.println(this.toString+" : dlco_clsf2 is null" );
}else{
	System.out.println(this.toString+" : dlco_clsf2 is "+dlco_clsf2 );
}
String mode3 = req.getParameter("mode3");
if( mode3 == null){
	System.out.println(this.toString+" : mode3 is null" );
}else{
	System.out.println(this.toString+" : mode3 is "+mode3 );
}
String preng_occr_seq3 = req.getParameter("preng_occr_seq3");
if( preng_occr_seq3 == null){
	System.out.println(this.toString+" : preng_occr_seq3 is null" );
}else{
	System.out.println(this.toString+" : preng_occr_seq3 is "+preng_occr_seq3 );
}
String issu_side3 = req.getParameter("issu_side3");
if( issu_side3 == null){
	System.out.println(this.toString+" : issu_side3 is null" );
}else{
	System.out.println(this.toString+" : issu_side3 is "+issu_side3 );
}
String sect_cd3 = req.getParameter("sect_cd3");
if( sect_cd3 == null){
	System.out.println(this.toString+" : sect_cd3 is null" );
}else{
	System.out.println(this.toString+" : sect_cd3 is "+sect_cd3 );
}
String sect_seq3 = req.getParameter("sect_seq3");
if( sect_seq3 == null){
	System.out.println(this.toString+" : sect_seq3 is null" );
}else{
	System.out.println(this.toString+" : sect_seq3 is "+sect_seq3 );
}
String cm3 = req.getParameter("cm3");
if( cm3 == null){
	System.out.println(this.toString+" : cm3 is null" );
}else{
	System.out.println(this.toString+" : cm3 is "+cm3 );
}
String dn3 = req.getParameter("dn3");
if( dn3 == null){
	System.out.println(this.toString+" : dn3 is null" );
}else{
	System.out.println(this.toString+" : dn3 is "+dn3 );
}
String chro_clsf3 = req.getParameter("chro_clsf3");
if( chro_clsf3 == null){
	System.out.println(this.toString+" : chro_clsf3 is null" );
}else{
	System.out.println(this.toString+" : chro_clsf3 is "+chro_clsf3 );
}
String advt_cont3 = req.getParameter("advt_cont3");
if( advt_cont3 == null){
	System.out.println(this.toString+" : advt_cont3 is null" );
}else{
	System.out.println(this.toString+" : advt_cont3 is "+advt_cont3 );
}
String uprc3 = req.getParameter("uprc3");
if( uprc3 == null){
	System.out.println(this.toString+" : uprc3 is null" );
}else{
	System.out.println(this.toString+" : uprc3 is "+uprc3 );
}
String advt_fee3 = req.getParameter("advt_fee3");
if( advt_fee3 == null){
	System.out.println(this.toString+" : advt_fee3 is null" );
}else{
	System.out.println(this.toString+" : advt_fee3 is "+advt_fee3 );
}
String slcrg_pers3 = req.getParameter("slcrg_pers3");
if( slcrg_pers3 == null){
	System.out.println(this.toString+" : slcrg_pers3 is null" );
}else{
	System.out.println(this.toString+" : slcrg_pers3 is "+slcrg_pers3 );
}
String agn3 = req.getParameter("agn3");
if( agn3 == null){
	System.out.println(this.toString+" : agn3 is null" );
}else{
	System.out.println(this.toString+" : agn3 is "+agn3 );
}
String dlco_clsf3 = req.getParameter("dlco_clsf3");
if( dlco_clsf3 == null){
	System.out.println(this.toString+" : dlco_clsf3 is null" );
}else{
	System.out.println(this.toString+" : dlco_clsf3 is "+dlco_clsf3 );
}
String mode4 = req.getParameter("mode4");
if( mode4 == null){
	System.out.println(this.toString+" : mode4 is null" );
}else{
	System.out.println(this.toString+" : mode4 is "+mode4 );
}
String preng_occr_seq4 = req.getParameter("preng_occr_seq4");
if( preng_occr_seq4 == null){
	System.out.println(this.toString+" : preng_occr_seq4 is null" );
}else{
	System.out.println(this.toString+" : preng_occr_seq4 is "+preng_occr_seq4 );
}
String issu_side4 = req.getParameter("issu_side4");
if( issu_side4 == null){
	System.out.println(this.toString+" : issu_side4 is null" );
}else{
	System.out.println(this.toString+" : issu_side4 is "+issu_side4 );
}
String sect_cd4 = req.getParameter("sect_cd4");
if( sect_cd4 == null){
	System.out.println(this.toString+" : sect_cd4 is null" );
}else{
	System.out.println(this.toString+" : sect_cd4 is "+sect_cd4 );
}
String sect_seq4 = req.getParameter("sect_seq4");
if( sect_seq4 == null){
	System.out.println(this.toString+" : sect_seq4 is null" );
}else{
	System.out.println(this.toString+" : sect_seq4 is "+sect_seq4 );
}
String cm4 = req.getParameter("cm4");
if( cm4 == null){
	System.out.println(this.toString+" : cm4 is null" );
}else{
	System.out.println(this.toString+" : cm4 is "+cm4 );
}
String dn4 = req.getParameter("dn4");
if( dn4 == null){
	System.out.println(this.toString+" : dn4 is null" );
}else{
	System.out.println(this.toString+" : dn4 is "+dn4 );
}
String chro_clsf4 = req.getParameter("chro_clsf4");
if( chro_clsf4 == null){
	System.out.println(this.toString+" : chro_clsf4 is null" );
}else{
	System.out.println(this.toString+" : chro_clsf4 is "+chro_clsf4 );
}
String advt_cont4 = req.getParameter("advt_cont4");
if( advt_cont4 == null){
	System.out.println(this.toString+" : advt_cont4 is null" );
}else{
	System.out.println(this.toString+" : advt_cont4 is "+advt_cont4 );
}
String uprc4 = req.getParameter("uprc4");
if( uprc4 == null){
	System.out.println(this.toString+" : uprc4 is null" );
}else{
	System.out.println(this.toString+" : uprc4 is "+uprc4 );
}
String advt_fee4 = req.getParameter("advt_fee4");
if( advt_fee4 == null){
	System.out.println(this.toString+" : advt_fee4 is null" );
}else{
	System.out.println(this.toString+" : advt_fee4 is "+advt_fee4 );
}
String slcrg_pers4 = req.getParameter("slcrg_pers4");
if( slcrg_pers4 == null){
	System.out.println(this.toString+" : slcrg_pers4 is null" );
}else{
	System.out.println(this.toString+" : slcrg_pers4 is "+slcrg_pers4 );
}
String agn4 = req.getParameter("agn4");
if( agn4 == null){
	System.out.println(this.toString+" : agn4 is null" );
}else{
	System.out.println(this.toString+" : agn4 is "+agn4 );
}
String dlco_clsf4 = req.getParameter("dlco_clsf4");
if( dlco_clsf4 == null){
	System.out.println(this.toString+" : dlco_clsf4 is null" );
}else{
	System.out.println(this.toString+" : dlco_clsf4 is "+dlco_clsf4 );
}
String mode5 = req.getParameter("mode5");
if( mode5 == null){
	System.out.println(this.toString+" : mode5 is null" );
}else{
	System.out.println(this.toString+" : mode5 is "+mode5 );
}
String preng_occr_seq5 = req.getParameter("preng_occr_seq5");
if( preng_occr_seq5 == null){
	System.out.println(this.toString+" : preng_occr_seq5 is null" );
}else{
	System.out.println(this.toString+" : preng_occr_seq5 is "+preng_occr_seq5 );
}
String issu_side5 = req.getParameter("issu_side5");
if( issu_side5 == null){
	System.out.println(this.toString+" : issu_side5 is null" );
}else{
	System.out.println(this.toString+" : issu_side5 is "+issu_side5 );
}
String sect_cd5 = req.getParameter("sect_cd5");
if( sect_cd5 == null){
	System.out.println(this.toString+" : sect_cd5 is null" );
}else{
	System.out.println(this.toString+" : sect_cd5 is "+sect_cd5 );
}
String sect_seq5 = req.getParameter("sect_seq5");
if( sect_seq5 == null){
	System.out.println(this.toString+" : sect_seq5 is null" );
}else{
	System.out.println(this.toString+" : sect_seq5 is "+sect_seq5 );
}
String cm5 = req.getParameter("cm5");
if( cm5 == null){
	System.out.println(this.toString+" : cm5 is null" );
}else{
	System.out.println(this.toString+" : cm5 is "+cm5 );
}
String dn5 = req.getParameter("dn5");
if( dn5 == null){
	System.out.println(this.toString+" : dn5 is null" );
}else{
	System.out.println(this.toString+" : dn5 is "+dn5 );
}
String chro_clsf5 = req.getParameter("chro_clsf5");
if( chro_clsf5 == null){
	System.out.println(this.toString+" : chro_clsf5 is null" );
}else{
	System.out.println(this.toString+" : chro_clsf5 is "+chro_clsf5 );
}
String advt_cont5 = req.getParameter("advt_cont5");
if( advt_cont5 == null){
	System.out.println(this.toString+" : advt_cont5 is null" );
}else{
	System.out.println(this.toString+" : advt_cont5 is "+advt_cont5 );
}
String uprc5 = req.getParameter("uprc5");
if( uprc5 == null){
	System.out.println(this.toString+" : uprc5 is null" );
}else{
	System.out.println(this.toString+" : uprc5 is "+uprc5 );
}
String advt_fee5 = req.getParameter("advt_fee5");
if( advt_fee5 == null){
	System.out.println(this.toString+" : advt_fee5 is null" );
}else{
	System.out.println(this.toString+" : advt_fee5 is "+advt_fee5 );
}
String slcrg_pers5 = req.getParameter("slcrg_pers5");
if( slcrg_pers5 == null){
	System.out.println(this.toString+" : slcrg_pers5 is null" );
}else{
	System.out.println(this.toString+" : slcrg_pers5 is "+slcrg_pers5 );
}
String agn5 = req.getParameter("agn5");
if( agn5 == null){
	System.out.println(this.toString+" : agn5 is null" );
}else{
	System.out.println(this.toString+" : agn5 is "+agn5 );
}
String dlco_clsf5 = req.getParameter("dlco_clsf5");
if( dlco_clsf5 == null){
	System.out.println(this.toString+" : dlco_clsf5 is null" );
}else{
	System.out.println(this.toString+" : dlco_clsf5 is "+dlco_clsf5 );
}
String mode6 = req.getParameter("mode6");
if( mode6 == null){
	System.out.println(this.toString+" : mode6 is null" );
}else{
	System.out.println(this.toString+" : mode6 is "+mode6 );
}
String preng_occr_seq6 = req.getParameter("preng_occr_seq6");
if( preng_occr_seq6 == null){
	System.out.println(this.toString+" : preng_occr_seq6 is null" );
}else{
	System.out.println(this.toString+" : preng_occr_seq6 is "+preng_occr_seq6 );
}
String issu_side6 = req.getParameter("issu_side6");
if( issu_side6 == null){
	System.out.println(this.toString+" : issu_side6 is null" );
}else{
	System.out.println(this.toString+" : issu_side6 is "+issu_side6 );
}
String sect_cd6 = req.getParameter("sect_cd6");
if( sect_cd6 == null){
	System.out.println(this.toString+" : sect_cd6 is null" );
}else{
	System.out.println(this.toString+" : sect_cd6 is "+sect_cd6 );
}
String sect_seq6 = req.getParameter("sect_seq6");
if( sect_seq6 == null){
	System.out.println(this.toString+" : sect_seq6 is null" );
}else{
	System.out.println(this.toString+" : sect_seq6 is "+sect_seq6 );
}
String cm6 = req.getParameter("cm6");
if( cm6 == null){
	System.out.println(this.toString+" : cm6 is null" );
}else{
	System.out.println(this.toString+" : cm6 is "+cm6 );
}
String dn6 = req.getParameter("dn6");
if( dn6 == null){
	System.out.println(this.toString+" : dn6 is null" );
}else{
	System.out.println(this.toString+" : dn6 is "+dn6 );
}
String chro_clsf6 = req.getParameter("chro_clsf6");
if( chro_clsf6 == null){
	System.out.println(this.toString+" : chro_clsf6 is null" );
}else{
	System.out.println(this.toString+" : chro_clsf6 is "+chro_clsf6 );
}
String advt_cont6 = req.getParameter("advt_cont6");
if( advt_cont6 == null){
	System.out.println(this.toString+" : advt_cont6 is null" );
}else{
	System.out.println(this.toString+" : advt_cont6 is "+advt_cont6 );
}
String uprc6 = req.getParameter("uprc6");
if( uprc6 == null){
	System.out.println(this.toString+" : uprc6 is null" );
}else{
	System.out.println(this.toString+" : uprc6 is "+uprc6 );
}
String advt_fee6 = req.getParameter("advt_fee6");
if( advt_fee6 == null){
	System.out.println(this.toString+" : advt_fee6 is null" );
}else{
	System.out.println(this.toString+" : advt_fee6 is "+advt_fee6 );
}
String slcrg_pers6 = req.getParameter("slcrg_pers6");
if( slcrg_pers6 == null){
	System.out.println(this.toString+" : slcrg_pers6 is null" );
}else{
	System.out.println(this.toString+" : slcrg_pers6 is "+slcrg_pers6 );
}
String agn6 = req.getParameter("agn6");
if( agn6 == null){
	System.out.println(this.toString+" : agn6 is null" );
}else{
	System.out.println(this.toString+" : agn6 is "+agn6 );
}
String dlco_clsf6 = req.getParameter("dlco_clsf6");
if( dlco_clsf6 == null){
	System.out.println(this.toString+" : dlco_clsf6 is null" );
}else{
	System.out.println(this.toString+" : dlco_clsf6 is "+dlco_clsf6 );
}
String mode7 = req.getParameter("mode7");
if( mode7 == null){
	System.out.println(this.toString+" : mode7 is null" );
}else{
	System.out.println(this.toString+" : mode7 is "+mode7 );
}
String preng_occr_seq7 = req.getParameter("preng_occr_seq7");
if( preng_occr_seq7 == null){
	System.out.println(this.toString+" : preng_occr_seq7 is null" );
}else{
	System.out.println(this.toString+" : preng_occr_seq7 is "+preng_occr_seq7 );
}
String issu_side7 = req.getParameter("issu_side7");
if( issu_side7 == null){
	System.out.println(this.toString+" : issu_side7 is null" );
}else{
	System.out.println(this.toString+" : issu_side7 is "+issu_side7 );
}
String sect_cd7 = req.getParameter("sect_cd7");
if( sect_cd7 == null){
	System.out.println(this.toString+" : sect_cd7 is null" );
}else{
	System.out.println(this.toString+" : sect_cd7 is "+sect_cd7 );
}
String sect_seq7 = req.getParameter("sect_seq7");
if( sect_seq7 == null){
	System.out.println(this.toString+" : sect_seq7 is null" );
}else{
	System.out.println(this.toString+" : sect_seq7 is "+sect_seq7 );
}
String cm7 = req.getParameter("cm7");
if( cm7 == null){
	System.out.println(this.toString+" : cm7 is null" );
}else{
	System.out.println(this.toString+" : cm7 is "+cm7 );
}
String dn7 = req.getParameter("dn7");
if( dn7 == null){
	System.out.println(this.toString+" : dn7 is null" );
}else{
	System.out.println(this.toString+" : dn7 is "+dn7 );
}
String chro_clsf7 = req.getParameter("chro_clsf7");
if( chro_clsf7 == null){
	System.out.println(this.toString+" : chro_clsf7 is null" );
}else{
	System.out.println(this.toString+" : chro_clsf7 is "+chro_clsf7 );
}
String advt_cont7 = req.getParameter("advt_cont7");
if( advt_cont7 == null){
	System.out.println(this.toString+" : advt_cont7 is null" );
}else{
	System.out.println(this.toString+" : advt_cont7 is "+advt_cont7 );
}
String uprc7 = req.getParameter("uprc7");
if( uprc7 == null){
	System.out.println(this.toString+" : uprc7 is null" );
}else{
	System.out.println(this.toString+" : uprc7 is "+uprc7 );
}
String advt_fee7 = req.getParameter("advt_fee7");
if( advt_fee7 == null){
	System.out.println(this.toString+" : advt_fee7 is null" );
}else{
	System.out.println(this.toString+" : advt_fee7 is "+advt_fee7 );
}
String slcrg_pers7 = req.getParameter("slcrg_pers7");
if( slcrg_pers7 == null){
	System.out.println(this.toString+" : slcrg_pers7 is null" );
}else{
	System.out.println(this.toString+" : slcrg_pers7 is "+slcrg_pers7 );
}
String agn7 = req.getParameter("agn7");
if( agn7 == null){
	System.out.println(this.toString+" : agn7 is null" );
}else{
	System.out.println(this.toString+" : agn7 is "+agn7 );
}
String dlco_clsf7 = req.getParameter("dlco_clsf7");
if( dlco_clsf7 == null){
	System.out.println(this.toString+" : dlco_clsf7 is null" );
}else{
	System.out.println(this.toString+" : dlco_clsf7 is "+dlco_clsf7 );
}
String mode8 = req.getParameter("mode8");
if( mode8 == null){
	System.out.println(this.toString+" : mode8 is null" );
}else{
	System.out.println(this.toString+" : mode8 is "+mode8 );
}
String preng_occr_seq8 = req.getParameter("preng_occr_seq8");
if( preng_occr_seq8 == null){
	System.out.println(this.toString+" : preng_occr_seq8 is null" );
}else{
	System.out.println(this.toString+" : preng_occr_seq8 is "+preng_occr_seq8 );
}
String issu_side8 = req.getParameter("issu_side8");
if( issu_side8 == null){
	System.out.println(this.toString+" : issu_side8 is null" );
}else{
	System.out.println(this.toString+" : issu_side8 is "+issu_side8 );
}
String sect_cd8 = req.getParameter("sect_cd8");
if( sect_cd8 == null){
	System.out.println(this.toString+" : sect_cd8 is null" );
}else{
	System.out.println(this.toString+" : sect_cd8 is "+sect_cd8 );
}
String sect_seq8 = req.getParameter("sect_seq8");
if( sect_seq8 == null){
	System.out.println(this.toString+" : sect_seq8 is null" );
}else{
	System.out.println(this.toString+" : sect_seq8 is "+sect_seq8 );
}
String cm8 = req.getParameter("cm8");
if( cm8 == null){
	System.out.println(this.toString+" : cm8 is null" );
}else{
	System.out.println(this.toString+" : cm8 is "+cm8 );
}
String dn8 = req.getParameter("dn8");
if( dn8 == null){
	System.out.println(this.toString+" : dn8 is null" );
}else{
	System.out.println(this.toString+" : dn8 is "+dn8 );
}
String chro_clsf8 = req.getParameter("chro_clsf8");
if( chro_clsf8 == null){
	System.out.println(this.toString+" : chro_clsf8 is null" );
}else{
	System.out.println(this.toString+" : chro_clsf8 is "+chro_clsf8 );
}
String advt_cont8 = req.getParameter("advt_cont8");
if( advt_cont8 == null){
	System.out.println(this.toString+" : advt_cont8 is null" );
}else{
	System.out.println(this.toString+" : advt_cont8 is "+advt_cont8 );
}
String uprc8 = req.getParameter("uprc8");
if( uprc8 == null){
	System.out.println(this.toString+" : uprc8 is null" );
}else{
	System.out.println(this.toString+" : uprc8 is "+uprc8 );
}
String advt_fee8 = req.getParameter("advt_fee8");
if( advt_fee8 == null){
	System.out.println(this.toString+" : advt_fee8 is null" );
}else{
	System.out.println(this.toString+" : advt_fee8 is "+advt_fee8 );
}
String slcrg_pers8 = req.getParameter("slcrg_pers8");
if( slcrg_pers8 == null){
	System.out.println(this.toString+" : slcrg_pers8 is null" );
}else{
	System.out.println(this.toString+" : slcrg_pers8 is "+slcrg_pers8 );
}
String agn8 = req.getParameter("agn8");
if( agn8 == null){
	System.out.println(this.toString+" : agn8 is null" );
}else{
	System.out.println(this.toString+" : agn8 is "+agn8 );
}
String dlco_clsf8 = req.getParameter("dlco_clsf8");
if( dlco_clsf8 == null){
	System.out.println(this.toString+" : dlco_clsf8 is null" );
}else{
	System.out.println(this.toString+" : dlco_clsf8 is "+dlco_clsf8 );
}
String unasin_uprc = req.getParameter("unasin_uprc");
if( unasin_uprc == null){
	System.out.println(this.toString+" : unasin_uprc is null" );
}else{
	System.out.println(this.toString+" : unasin_uprc is "+unasin_uprc );
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
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String pubc_dt = Util.checkString(req.getParameter("pubc_dt"));
String mode0 = Util.checkString(req.getParameter("mode0"));
String preng_occr_seq0 = Util.checkString(req.getParameter("preng_occr_seq0"));
String issu_side0 = Util.checkString(req.getParameter("issu_side0"));
String sect_cd0 = Util.checkString(req.getParameter("sect_cd0"));
String sect_seq0 = Util.checkString(req.getParameter("sect_seq0"));
String cm0 = Util.checkString(req.getParameter("cm0"));
String dn0 = Util.checkString(req.getParameter("dn0"));
String chro_clsf0 = Util.checkString(req.getParameter("chro_clsf0"));
String advt_cont0 = Util.checkString(req.getParameter("advt_cont0"));
String uprc0 = Util.checkString(req.getParameter("uprc0"));
String advt_fee0 = Util.checkString(req.getParameter("advt_fee0"));
String slcrg_pers0 = Util.checkString(req.getParameter("slcrg_pers0"));
String agn0 = Util.checkString(req.getParameter("agn0"));
String dlco_clsf0 = Util.checkString(req.getParameter("dlco_clsf0"));
String mode1 = Util.checkString(req.getParameter("mode1"));
String preng_occr_seq1 = Util.checkString(req.getParameter("preng_occr_seq1"));
String issu_side1 = Util.checkString(req.getParameter("issu_side1"));
String sect_cd1 = Util.checkString(req.getParameter("sect_cd1"));
String sect_seq1 = Util.checkString(req.getParameter("sect_seq1"));
String cm1 = Util.checkString(req.getParameter("cm1"));
String dn1 = Util.checkString(req.getParameter("dn1"));
String chro_clsf1 = Util.checkString(req.getParameter("chro_clsf1"));
String advt_cont1 = Util.checkString(req.getParameter("advt_cont1"));
String uprc1 = Util.checkString(req.getParameter("uprc1"));
String advt_fee1 = Util.checkString(req.getParameter("advt_fee1"));
String slcrg_pers1 = Util.checkString(req.getParameter("slcrg_pers1"));
String agn1 = Util.checkString(req.getParameter("agn1"));
String dlco_clsf1 = Util.checkString(req.getParameter("dlco_clsf1"));
String mode2 = Util.checkString(req.getParameter("mode2"));
String preng_occr_seq2 = Util.checkString(req.getParameter("preng_occr_seq2"));
String issu_side2 = Util.checkString(req.getParameter("issu_side2"));
String sect_cd2 = Util.checkString(req.getParameter("sect_cd2"));
String sect_seq2 = Util.checkString(req.getParameter("sect_seq2"));
String cm2 = Util.checkString(req.getParameter("cm2"));
String dn2 = Util.checkString(req.getParameter("dn2"));
String chro_clsf2 = Util.checkString(req.getParameter("chro_clsf2"));
String advt_cont2 = Util.checkString(req.getParameter("advt_cont2"));
String uprc2 = Util.checkString(req.getParameter("uprc2"));
String advt_fee2 = Util.checkString(req.getParameter("advt_fee2"));
String slcrg_pers2 = Util.checkString(req.getParameter("slcrg_pers2"));
String agn2 = Util.checkString(req.getParameter("agn2"));
String dlco_clsf2 = Util.checkString(req.getParameter("dlco_clsf2"));
String mode3 = Util.checkString(req.getParameter("mode3"));
String preng_occr_seq3 = Util.checkString(req.getParameter("preng_occr_seq3"));
String issu_side3 = Util.checkString(req.getParameter("issu_side3"));
String sect_cd3 = Util.checkString(req.getParameter("sect_cd3"));
String sect_seq3 = Util.checkString(req.getParameter("sect_seq3"));
String cm3 = Util.checkString(req.getParameter("cm3"));
String dn3 = Util.checkString(req.getParameter("dn3"));
String chro_clsf3 = Util.checkString(req.getParameter("chro_clsf3"));
String advt_cont3 = Util.checkString(req.getParameter("advt_cont3"));
String uprc3 = Util.checkString(req.getParameter("uprc3"));
String advt_fee3 = Util.checkString(req.getParameter("advt_fee3"));
String slcrg_pers3 = Util.checkString(req.getParameter("slcrg_pers3"));
String agn3 = Util.checkString(req.getParameter("agn3"));
String dlco_clsf3 = Util.checkString(req.getParameter("dlco_clsf3"));
String mode4 = Util.checkString(req.getParameter("mode4"));
String preng_occr_seq4 = Util.checkString(req.getParameter("preng_occr_seq4"));
String issu_side4 = Util.checkString(req.getParameter("issu_side4"));
String sect_cd4 = Util.checkString(req.getParameter("sect_cd4"));
String sect_seq4 = Util.checkString(req.getParameter("sect_seq4"));
String cm4 = Util.checkString(req.getParameter("cm4"));
String dn4 = Util.checkString(req.getParameter("dn4"));
String chro_clsf4 = Util.checkString(req.getParameter("chro_clsf4"));
String advt_cont4 = Util.checkString(req.getParameter("advt_cont4"));
String uprc4 = Util.checkString(req.getParameter("uprc4"));
String advt_fee4 = Util.checkString(req.getParameter("advt_fee4"));
String slcrg_pers4 = Util.checkString(req.getParameter("slcrg_pers4"));
String agn4 = Util.checkString(req.getParameter("agn4"));
String dlco_clsf4 = Util.checkString(req.getParameter("dlco_clsf4"));
String mode5 = Util.checkString(req.getParameter("mode5"));
String preng_occr_seq5 = Util.checkString(req.getParameter("preng_occr_seq5"));
String issu_side5 = Util.checkString(req.getParameter("issu_side5"));
String sect_cd5 = Util.checkString(req.getParameter("sect_cd5"));
String sect_seq5 = Util.checkString(req.getParameter("sect_seq5"));
String cm5 = Util.checkString(req.getParameter("cm5"));
String dn5 = Util.checkString(req.getParameter("dn5"));
String chro_clsf5 = Util.checkString(req.getParameter("chro_clsf5"));
String advt_cont5 = Util.checkString(req.getParameter("advt_cont5"));
String uprc5 = Util.checkString(req.getParameter("uprc5"));
String advt_fee5 = Util.checkString(req.getParameter("advt_fee5"));
String slcrg_pers5 = Util.checkString(req.getParameter("slcrg_pers5"));
String agn5 = Util.checkString(req.getParameter("agn5"));
String dlco_clsf5 = Util.checkString(req.getParameter("dlco_clsf5"));
String mode6 = Util.checkString(req.getParameter("mode6"));
String preng_occr_seq6 = Util.checkString(req.getParameter("preng_occr_seq6"));
String issu_side6 = Util.checkString(req.getParameter("issu_side6"));
String sect_cd6 = Util.checkString(req.getParameter("sect_cd6"));
String sect_seq6 = Util.checkString(req.getParameter("sect_seq6"));
String cm6 = Util.checkString(req.getParameter("cm6"));
String dn6 = Util.checkString(req.getParameter("dn6"));
String chro_clsf6 = Util.checkString(req.getParameter("chro_clsf6"));
String advt_cont6 = Util.checkString(req.getParameter("advt_cont6"));
String uprc6 = Util.checkString(req.getParameter("uprc6"));
String advt_fee6 = Util.checkString(req.getParameter("advt_fee6"));
String slcrg_pers6 = Util.checkString(req.getParameter("slcrg_pers6"));
String agn6 = Util.checkString(req.getParameter("agn6"));
String dlco_clsf6 = Util.checkString(req.getParameter("dlco_clsf6"));
String mode7 = Util.checkString(req.getParameter("mode7"));
String preng_occr_seq7 = Util.checkString(req.getParameter("preng_occr_seq7"));
String issu_side7 = Util.checkString(req.getParameter("issu_side7"));
String sect_cd7 = Util.checkString(req.getParameter("sect_cd7"));
String sect_seq7 = Util.checkString(req.getParameter("sect_seq7"));
String cm7 = Util.checkString(req.getParameter("cm7"));
String dn7 = Util.checkString(req.getParameter("dn7"));
String chro_clsf7 = Util.checkString(req.getParameter("chro_clsf7"));
String advt_cont7 = Util.checkString(req.getParameter("advt_cont7"));
String uprc7 = Util.checkString(req.getParameter("uprc7"));
String advt_fee7 = Util.checkString(req.getParameter("advt_fee7"));
String slcrg_pers7 = Util.checkString(req.getParameter("slcrg_pers7"));
String agn7 = Util.checkString(req.getParameter("agn7"));
String dlco_clsf7 = Util.checkString(req.getParameter("dlco_clsf7"));
String mode8 = Util.checkString(req.getParameter("mode8"));
String preng_occr_seq8 = Util.checkString(req.getParameter("preng_occr_seq8"));
String issu_side8 = Util.checkString(req.getParameter("issu_side8"));
String sect_cd8 = Util.checkString(req.getParameter("sect_cd8"));
String sect_seq8 = Util.checkString(req.getParameter("sect_seq8"));
String cm8 = Util.checkString(req.getParameter("cm8"));
String dn8 = Util.checkString(req.getParameter("dn8"));
String chro_clsf8 = Util.checkString(req.getParameter("chro_clsf8"));
String advt_cont8 = Util.checkString(req.getParameter("advt_cont8"));
String uprc8 = Util.checkString(req.getParameter("uprc8"));
String advt_fee8 = Util.checkString(req.getParameter("advt_fee8"));
String slcrg_pers8 = Util.checkString(req.getParameter("slcrg_pers8"));
String agn8 = Util.checkString(req.getParameter("agn8"));
String dlco_clsf8 = Util.checkString(req.getParameter("dlco_clsf8"));
String unasin_uprc = Util.checkString(req.getParameter("unasin_uprc"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String pubc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("pubc_dt")));
String mode0 = Util.Uni2Ksc(Util.checkString(req.getParameter("mode0")));
String preng_occr_seq0 = Util.Uni2Ksc(Util.checkString(req.getParameter("preng_occr_seq0")));
String issu_side0 = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_side0")));
String sect_cd0 = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_cd0")));
String sect_seq0 = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_seq0")));
String cm0 = Util.Uni2Ksc(Util.checkString(req.getParameter("cm0")));
String dn0 = Util.Uni2Ksc(Util.checkString(req.getParameter("dn0")));
String chro_clsf0 = Util.Uni2Ksc(Util.checkString(req.getParameter("chro_clsf0")));
String advt_cont0 = Util.Uni2Ksc(Util.checkString(req.getParameter("advt_cont0")));
String uprc0 = Util.Uni2Ksc(Util.checkString(req.getParameter("uprc0")));
String advt_fee0 = Util.Uni2Ksc(Util.checkString(req.getParameter("advt_fee0")));
String slcrg_pers0 = Util.Uni2Ksc(Util.checkString(req.getParameter("slcrg_pers0")));
String agn0 = Util.Uni2Ksc(Util.checkString(req.getParameter("agn0")));
String dlco_clsf0 = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf0")));
String mode1 = Util.Uni2Ksc(Util.checkString(req.getParameter("mode1")));
String preng_occr_seq1 = Util.Uni2Ksc(Util.checkString(req.getParameter("preng_occr_seq1")));
String issu_side1 = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_side1")));
String sect_cd1 = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_cd1")));
String sect_seq1 = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_seq1")));
String cm1 = Util.Uni2Ksc(Util.checkString(req.getParameter("cm1")));
String dn1 = Util.Uni2Ksc(Util.checkString(req.getParameter("dn1")));
String chro_clsf1 = Util.Uni2Ksc(Util.checkString(req.getParameter("chro_clsf1")));
String advt_cont1 = Util.Uni2Ksc(Util.checkString(req.getParameter("advt_cont1")));
String uprc1 = Util.Uni2Ksc(Util.checkString(req.getParameter("uprc1")));
String advt_fee1 = Util.Uni2Ksc(Util.checkString(req.getParameter("advt_fee1")));
String slcrg_pers1 = Util.Uni2Ksc(Util.checkString(req.getParameter("slcrg_pers1")));
String agn1 = Util.Uni2Ksc(Util.checkString(req.getParameter("agn1")));
String dlco_clsf1 = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf1")));
String mode2 = Util.Uni2Ksc(Util.checkString(req.getParameter("mode2")));
String preng_occr_seq2 = Util.Uni2Ksc(Util.checkString(req.getParameter("preng_occr_seq2")));
String issu_side2 = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_side2")));
String sect_cd2 = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_cd2")));
String sect_seq2 = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_seq2")));
String cm2 = Util.Uni2Ksc(Util.checkString(req.getParameter("cm2")));
String dn2 = Util.Uni2Ksc(Util.checkString(req.getParameter("dn2")));
String chro_clsf2 = Util.Uni2Ksc(Util.checkString(req.getParameter("chro_clsf2")));
String advt_cont2 = Util.Uni2Ksc(Util.checkString(req.getParameter("advt_cont2")));
String uprc2 = Util.Uni2Ksc(Util.checkString(req.getParameter("uprc2")));
String advt_fee2 = Util.Uni2Ksc(Util.checkString(req.getParameter("advt_fee2")));
String slcrg_pers2 = Util.Uni2Ksc(Util.checkString(req.getParameter("slcrg_pers2")));
String agn2 = Util.Uni2Ksc(Util.checkString(req.getParameter("agn2")));
String dlco_clsf2 = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf2")));
String mode3 = Util.Uni2Ksc(Util.checkString(req.getParameter("mode3")));
String preng_occr_seq3 = Util.Uni2Ksc(Util.checkString(req.getParameter("preng_occr_seq3")));
String issu_side3 = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_side3")));
String sect_cd3 = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_cd3")));
String sect_seq3 = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_seq3")));
String cm3 = Util.Uni2Ksc(Util.checkString(req.getParameter("cm3")));
String dn3 = Util.Uni2Ksc(Util.checkString(req.getParameter("dn3")));
String chro_clsf3 = Util.Uni2Ksc(Util.checkString(req.getParameter("chro_clsf3")));
String advt_cont3 = Util.Uni2Ksc(Util.checkString(req.getParameter("advt_cont3")));
String uprc3 = Util.Uni2Ksc(Util.checkString(req.getParameter("uprc3")));
String advt_fee3 = Util.Uni2Ksc(Util.checkString(req.getParameter("advt_fee3")));
String slcrg_pers3 = Util.Uni2Ksc(Util.checkString(req.getParameter("slcrg_pers3")));
String agn3 = Util.Uni2Ksc(Util.checkString(req.getParameter("agn3")));
String dlco_clsf3 = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf3")));
String mode4 = Util.Uni2Ksc(Util.checkString(req.getParameter("mode4")));
String preng_occr_seq4 = Util.Uni2Ksc(Util.checkString(req.getParameter("preng_occr_seq4")));
String issu_side4 = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_side4")));
String sect_cd4 = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_cd4")));
String sect_seq4 = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_seq4")));
String cm4 = Util.Uni2Ksc(Util.checkString(req.getParameter("cm4")));
String dn4 = Util.Uni2Ksc(Util.checkString(req.getParameter("dn4")));
String chro_clsf4 = Util.Uni2Ksc(Util.checkString(req.getParameter("chro_clsf4")));
String advt_cont4 = Util.Uni2Ksc(Util.checkString(req.getParameter("advt_cont4")));
String uprc4 = Util.Uni2Ksc(Util.checkString(req.getParameter("uprc4")));
String advt_fee4 = Util.Uni2Ksc(Util.checkString(req.getParameter("advt_fee4")));
String slcrg_pers4 = Util.Uni2Ksc(Util.checkString(req.getParameter("slcrg_pers4")));
String agn4 = Util.Uni2Ksc(Util.checkString(req.getParameter("agn4")));
String dlco_clsf4 = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf4")));
String mode5 = Util.Uni2Ksc(Util.checkString(req.getParameter("mode5")));
String preng_occr_seq5 = Util.Uni2Ksc(Util.checkString(req.getParameter("preng_occr_seq5")));
String issu_side5 = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_side5")));
String sect_cd5 = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_cd5")));
String sect_seq5 = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_seq5")));
String cm5 = Util.Uni2Ksc(Util.checkString(req.getParameter("cm5")));
String dn5 = Util.Uni2Ksc(Util.checkString(req.getParameter("dn5")));
String chro_clsf5 = Util.Uni2Ksc(Util.checkString(req.getParameter("chro_clsf5")));
String advt_cont5 = Util.Uni2Ksc(Util.checkString(req.getParameter("advt_cont5")));
String uprc5 = Util.Uni2Ksc(Util.checkString(req.getParameter("uprc5")));
String advt_fee5 = Util.Uni2Ksc(Util.checkString(req.getParameter("advt_fee5")));
String slcrg_pers5 = Util.Uni2Ksc(Util.checkString(req.getParameter("slcrg_pers5")));
String agn5 = Util.Uni2Ksc(Util.checkString(req.getParameter("agn5")));
String dlco_clsf5 = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf5")));
String mode6 = Util.Uni2Ksc(Util.checkString(req.getParameter("mode6")));
String preng_occr_seq6 = Util.Uni2Ksc(Util.checkString(req.getParameter("preng_occr_seq6")));
String issu_side6 = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_side6")));
String sect_cd6 = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_cd6")));
String sect_seq6 = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_seq6")));
String cm6 = Util.Uni2Ksc(Util.checkString(req.getParameter("cm6")));
String dn6 = Util.Uni2Ksc(Util.checkString(req.getParameter("dn6")));
String chro_clsf6 = Util.Uni2Ksc(Util.checkString(req.getParameter("chro_clsf6")));
String advt_cont6 = Util.Uni2Ksc(Util.checkString(req.getParameter("advt_cont6")));
String uprc6 = Util.Uni2Ksc(Util.checkString(req.getParameter("uprc6")));
String advt_fee6 = Util.Uni2Ksc(Util.checkString(req.getParameter("advt_fee6")));
String slcrg_pers6 = Util.Uni2Ksc(Util.checkString(req.getParameter("slcrg_pers6")));
String agn6 = Util.Uni2Ksc(Util.checkString(req.getParameter("agn6")));
String dlco_clsf6 = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf6")));
String mode7 = Util.Uni2Ksc(Util.checkString(req.getParameter("mode7")));
String preng_occr_seq7 = Util.Uni2Ksc(Util.checkString(req.getParameter("preng_occr_seq7")));
String issu_side7 = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_side7")));
String sect_cd7 = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_cd7")));
String sect_seq7 = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_seq7")));
String cm7 = Util.Uni2Ksc(Util.checkString(req.getParameter("cm7")));
String dn7 = Util.Uni2Ksc(Util.checkString(req.getParameter("dn7")));
String chro_clsf7 = Util.Uni2Ksc(Util.checkString(req.getParameter("chro_clsf7")));
String advt_cont7 = Util.Uni2Ksc(Util.checkString(req.getParameter("advt_cont7")));
String uprc7 = Util.Uni2Ksc(Util.checkString(req.getParameter("uprc7")));
String advt_fee7 = Util.Uni2Ksc(Util.checkString(req.getParameter("advt_fee7")));
String slcrg_pers7 = Util.Uni2Ksc(Util.checkString(req.getParameter("slcrg_pers7")));
String agn7 = Util.Uni2Ksc(Util.checkString(req.getParameter("agn7")));
String dlco_clsf7 = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf7")));
String mode8 = Util.Uni2Ksc(Util.checkString(req.getParameter("mode8")));
String preng_occr_seq8 = Util.Uni2Ksc(Util.checkString(req.getParameter("preng_occr_seq8")));
String issu_side8 = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_side8")));
String sect_cd8 = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_cd8")));
String sect_seq8 = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_seq8")));
String cm8 = Util.Uni2Ksc(Util.checkString(req.getParameter("cm8")));
String dn8 = Util.Uni2Ksc(Util.checkString(req.getParameter("dn8")));
String chro_clsf8 = Util.Uni2Ksc(Util.checkString(req.getParameter("chro_clsf8")));
String advt_cont8 = Util.Uni2Ksc(Util.checkString(req.getParameter("advt_cont8")));
String uprc8 = Util.Uni2Ksc(Util.checkString(req.getParameter("uprc8")));
String advt_fee8 = Util.Uni2Ksc(Util.checkString(req.getParameter("advt_fee8")));
String slcrg_pers8 = Util.Uni2Ksc(Util.checkString(req.getParameter("slcrg_pers8")));
String agn8 = Util.Uni2Ksc(Util.checkString(req.getParameter("agn8")));
String dlco_clsf8 = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf8")));
String unasin_uprc = Util.Uni2Ksc(Util.checkString(req.getParameter("unasin_uprc")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMedi_cd(medi_cd);
dm.setPubc_dt(pubc_dt);
dm.setMode0(mode0);
dm.setPreng_occr_seq0(preng_occr_seq0);
dm.setIssu_side0(issu_side0);
dm.setSect_cd0(sect_cd0);
dm.setSect_seq0(sect_seq0);
dm.setCm0(cm0);
dm.setDn0(dn0);
dm.setChro_clsf0(chro_clsf0);
dm.setAdvt_cont0(advt_cont0);
dm.setUprc0(uprc0);
dm.setAdvt_fee0(advt_fee0);
dm.setSlcrg_pers0(slcrg_pers0);
dm.setAgn0(agn0);
dm.setDlco_clsf0(dlco_clsf0);
dm.setMode1(mode1);
dm.setPreng_occr_seq1(preng_occr_seq1);
dm.setIssu_side1(issu_side1);
dm.setSect_cd1(sect_cd1);
dm.setSect_seq1(sect_seq1);
dm.setCm1(cm1);
dm.setDn1(dn1);
dm.setChro_clsf1(chro_clsf1);
dm.setAdvt_cont1(advt_cont1);
dm.setUprc1(uprc1);
dm.setAdvt_fee1(advt_fee1);
dm.setSlcrg_pers1(slcrg_pers1);
dm.setAgn1(agn1);
dm.setDlco_clsf1(dlco_clsf1);
dm.setMode2(mode2);
dm.setPreng_occr_seq2(preng_occr_seq2);
dm.setIssu_side2(issu_side2);
dm.setSect_cd2(sect_cd2);
dm.setSect_seq2(sect_seq2);
dm.setCm2(cm2);
dm.setDn2(dn2);
dm.setChro_clsf2(chro_clsf2);
dm.setAdvt_cont2(advt_cont2);
dm.setUprc2(uprc2);
dm.setAdvt_fee2(advt_fee2);
dm.setSlcrg_pers2(slcrg_pers2);
dm.setAgn2(agn2);
dm.setDlco_clsf2(dlco_clsf2);
dm.setMode3(mode3);
dm.setPreng_occr_seq3(preng_occr_seq3);
dm.setIssu_side3(issu_side3);
dm.setSect_cd3(sect_cd3);
dm.setSect_seq3(sect_seq3);
dm.setCm3(cm3);
dm.setDn3(dn3);
dm.setChro_clsf3(chro_clsf3);
dm.setAdvt_cont3(advt_cont3);
dm.setUprc3(uprc3);
dm.setAdvt_fee3(advt_fee3);
dm.setSlcrg_pers3(slcrg_pers3);
dm.setAgn3(agn3);
dm.setDlco_clsf3(dlco_clsf3);
dm.setMode4(mode4);
dm.setPreng_occr_seq4(preng_occr_seq4);
dm.setIssu_side4(issu_side4);
dm.setSect_cd4(sect_cd4);
dm.setSect_seq4(sect_seq4);
dm.setCm4(cm4);
dm.setDn4(dn4);
dm.setChro_clsf4(chro_clsf4);
dm.setAdvt_cont4(advt_cont4);
dm.setUprc4(uprc4);
dm.setAdvt_fee4(advt_fee4);
dm.setSlcrg_pers4(slcrg_pers4);
dm.setAgn4(agn4);
dm.setDlco_clsf4(dlco_clsf4);
dm.setMode5(mode5);
dm.setPreng_occr_seq5(preng_occr_seq5);
dm.setIssu_side5(issu_side5);
dm.setSect_cd5(sect_cd5);
dm.setSect_seq5(sect_seq5);
dm.setCm5(cm5);
dm.setDn5(dn5);
dm.setChro_clsf5(chro_clsf5);
dm.setAdvt_cont5(advt_cont5);
dm.setUprc5(uprc5);
dm.setAdvt_fee5(advt_fee5);
dm.setSlcrg_pers5(slcrg_pers5);
dm.setAgn5(agn5);
dm.setDlco_clsf5(dlco_clsf5);
dm.setMode6(mode6);
dm.setPreng_occr_seq6(preng_occr_seq6);
dm.setIssu_side6(issu_side6);
dm.setSect_cd6(sect_cd6);
dm.setSect_seq6(sect_seq6);
dm.setCm6(cm6);
dm.setDn6(dn6);
dm.setChro_clsf6(chro_clsf6);
dm.setAdvt_cont6(advt_cont6);
dm.setUprc6(uprc6);
dm.setAdvt_fee6(advt_fee6);
dm.setSlcrg_pers6(slcrg_pers6);
dm.setAgn6(agn6);
dm.setDlco_clsf6(dlco_clsf6);
dm.setMode7(mode7);
dm.setPreng_occr_seq7(preng_occr_seq7);
dm.setIssu_side7(issu_side7);
dm.setSect_cd7(sect_cd7);
dm.setSect_seq7(sect_seq7);
dm.setCm7(cm7);
dm.setDn7(dn7);
dm.setChro_clsf7(chro_clsf7);
dm.setAdvt_cont7(advt_cont7);
dm.setUprc7(uprc7);
dm.setAdvt_fee7(advt_fee7);
dm.setSlcrg_pers7(slcrg_pers7);
dm.setAgn7(agn7);
dm.setDlco_clsf7(dlco_clsf7);
dm.setMode8(mode8);
dm.setPreng_occr_seq8(preng_occr_seq8);
dm.setIssu_side8(issu_side8);
dm.setSect_cd8(sect_cd8);
dm.setSect_seq8(sect_seq8);
dm.setCm8(cm8);
dm.setDn8(dn8);
dm.setChro_clsf8(chro_clsf8);
dm.setAdvt_cont8(advt_cont8);
dm.setUprc8(uprc8);
dm.setAdvt_fee8(advt_fee8);
dm.setSlcrg_pers8(slcrg_pers8);
dm.setAgn8(agn8);
dm.setDlco_clsf8(dlco_clsf8);
dm.setUnasin_uprc(unasin_uprc);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat Jul 04 13:01:20 KST 2009 */