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


package chosun.ciis.se.boi.rec;

import java.sql.*;
import chosun.ciis.se.boi.dm.*;
import chosun.ciis.se.boi.ds.*;

/**
 * 
 */


public class SE_BOI_1057_LCURCOMMLIST2Record extends java.lang.Object implements java.io.Serializable{

	public int d_rdr_extnaplc;
	public int d_rdr_extnemp;
	public int d_rdr_extnstaf;
	public int d_rdr_extnrdr_movm;
	public int d_rdr_extnhdqt;
	public int d_rdr_extn_tot;
	public int d_rdr_extnrate;
	public int d_suspmovm;
	public int d_susprefu;
	public int d_suspothnwsp;
	public int d_suspetc;
	public int d_susp_tot;
	public int d_susprate;
	public int d_hmmsendqty;
	public int d_hmmvalqty;
	public int d_ftcnt1;
	public int d_ftcnt2;
	public int d_ftcnt3;
	public int d_ftcnt4;
	public int d_excsaftcnt6;
	public int d_aftcnt_tot;
	public int d_pub_infonwsp;
	public int d_dntnwsp;
	public int d_resvnwsp;
	public int d_hmmsendqty1;
	public int d_hmmsendqty2;
	public int d_hmmsendqty3;
	public int d_hmmsendqty4;
	public int d_hmmsendqty5;
	public int d_hmmsendqty_etc_tot;
	public int pm_hmmvalqtyb;
	public int pm_aftcnt_totb;
	public int pm_val_totb;
	public int d_hmmvalqtyb;
	public int d_aftcnt_totb;
	public int d_val_totb;
	public int dpm_hmmvalqtyb;
	public int dpm_aftcnt_totb;
	public int dpm_val_totb;
	public int dpy_hmmvalqtyb;
	public int dpy_aftcnt_totb;
	public int dpy_val_totb;
	public int d_meda_amt;
	public int d_giroclamt;
	public int d_vistclamt;
	public int d_giroauto_shiftclamt;
	public int d_docard_shiftclamt;
	public int d_gnrcard_shiftclamt;
	public int d_onlsetlclamt;
	public int d_etcclamt;
	public int d_clamt_tot;
	public int pm_clamt_tot;
	public int dpm_clamt_tot;
	public int d_arealeafclamt;
	public int d_teampreisleafclamt;
	public int d_leafclamt;

	public SE_BOI_1057_LCURCOMMLIST2Record(){}

	public void setD_rdr_extnaplc(int d_rdr_extnaplc){
		this.d_rdr_extnaplc = d_rdr_extnaplc;
	}

	public void setD_rdr_extnemp(int d_rdr_extnemp){
		this.d_rdr_extnemp = d_rdr_extnemp;
	}

	public void setD_rdr_extnstaf(int d_rdr_extnstaf){
		this.d_rdr_extnstaf = d_rdr_extnstaf;
	}

	public void setD_rdr_extnrdr_movm(int d_rdr_extnrdr_movm){
		this.d_rdr_extnrdr_movm = d_rdr_extnrdr_movm;
	}

	public void setD_rdr_extnhdqt(int d_rdr_extnhdqt){
		this.d_rdr_extnhdqt = d_rdr_extnhdqt;
	}

	public void setD_rdr_extn_tot(int d_rdr_extn_tot){
		this.d_rdr_extn_tot = d_rdr_extn_tot;
	}

	public void setD_rdr_extnrate(int d_rdr_extnrate){
		this.d_rdr_extnrate = d_rdr_extnrate;
	}

	public void setD_suspmovm(int d_suspmovm){
		this.d_suspmovm = d_suspmovm;
	}

	public void setD_susprefu(int d_susprefu){
		this.d_susprefu = d_susprefu;
	}

	public void setD_suspothnwsp(int d_suspothnwsp){
		this.d_suspothnwsp = d_suspothnwsp;
	}

	public void setD_suspetc(int d_suspetc){
		this.d_suspetc = d_suspetc;
	}

	public void setD_susp_tot(int d_susp_tot){
		this.d_susp_tot = d_susp_tot;
	}

	public void setD_susprate(int d_susprate){
		this.d_susprate = d_susprate;
	}

	public void setD_hmmsendqty(int d_hmmsendqty){
		this.d_hmmsendqty = d_hmmsendqty;
	}

	public void setD_hmmvalqty(int d_hmmvalqty){
		this.d_hmmvalqty = d_hmmvalqty;
	}

	public void setD_ftcnt1(int d_ftcnt1){
		this.d_ftcnt1 = d_ftcnt1;
	}

	public void setD_ftcnt2(int d_ftcnt2){
		this.d_ftcnt2 = d_ftcnt2;
	}

	public void setD_ftcnt3(int d_ftcnt3){
		this.d_ftcnt3 = d_ftcnt3;
	}

	public void setD_ftcnt4(int d_ftcnt4){
		this.d_ftcnt4 = d_ftcnt4;
	}

	public void setD_excsaftcnt6(int d_excsaftcnt6){
		this.d_excsaftcnt6 = d_excsaftcnt6;
	}

	public void setD_aftcnt_tot(int d_aftcnt_tot){
		this.d_aftcnt_tot = d_aftcnt_tot;
	}

	public void setD_pub_infonwsp(int d_pub_infonwsp){
		this.d_pub_infonwsp = d_pub_infonwsp;
	}

	public void setD_dntnwsp(int d_dntnwsp){
		this.d_dntnwsp = d_dntnwsp;
	}

	public void setD_resvnwsp(int d_resvnwsp){
		this.d_resvnwsp = d_resvnwsp;
	}

	public void setD_hmmsendqty1(int d_hmmsendqty1){
		this.d_hmmsendqty1 = d_hmmsendqty1;
	}

	public void setD_hmmsendqty2(int d_hmmsendqty2){
		this.d_hmmsendqty2 = d_hmmsendqty2;
	}

	public void setD_hmmsendqty3(int d_hmmsendqty3){
		this.d_hmmsendqty3 = d_hmmsendqty3;
	}

	public void setD_hmmsendqty4(int d_hmmsendqty4){
		this.d_hmmsendqty4 = d_hmmsendqty4;
	}

	public void setD_hmmsendqty5(int d_hmmsendqty5){
		this.d_hmmsendqty5 = d_hmmsendqty5;
	}

	public void setD_hmmsendqty_etc_tot(int d_hmmsendqty_etc_tot){
		this.d_hmmsendqty_etc_tot = d_hmmsendqty_etc_tot;
	}

	public void setPm_hmmvalqtyb(int pm_hmmvalqtyb){
		this.pm_hmmvalqtyb = pm_hmmvalqtyb;
	}

	public void setPm_aftcnt_totb(int pm_aftcnt_totb){
		this.pm_aftcnt_totb = pm_aftcnt_totb;
	}

	public void setPm_val_totb(int pm_val_totb){
		this.pm_val_totb = pm_val_totb;
	}

	public void setD_hmmvalqtyb(int d_hmmvalqtyb){
		this.d_hmmvalqtyb = d_hmmvalqtyb;
	}

	public void setD_aftcnt_totb(int d_aftcnt_totb){
		this.d_aftcnt_totb = d_aftcnt_totb;
	}

	public void setD_val_totb(int d_val_totb){
		this.d_val_totb = d_val_totb;
	}

	public void setDpm_hmmvalqtyb(int dpm_hmmvalqtyb){
		this.dpm_hmmvalqtyb = dpm_hmmvalqtyb;
	}

	public void setDpm_aftcnt_totb(int dpm_aftcnt_totb){
		this.dpm_aftcnt_totb = dpm_aftcnt_totb;
	}

	public void setDpm_val_totb(int dpm_val_totb){
		this.dpm_val_totb = dpm_val_totb;
	}

	public void setDpy_hmmvalqtyb(int dpy_hmmvalqtyb){
		this.dpy_hmmvalqtyb = dpy_hmmvalqtyb;
	}

	public void setDpy_aftcnt_totb(int dpy_aftcnt_totb){
		this.dpy_aftcnt_totb = dpy_aftcnt_totb;
	}

	public void setDpy_val_totb(int dpy_val_totb){
		this.dpy_val_totb = dpy_val_totb;
	}

	public void setD_meda_amt(int d_meda_amt){
		this.d_meda_amt = d_meda_amt;
	}

	public void setD_giroclamt(int d_giroclamt){
		this.d_giroclamt = d_giroclamt;
	}

	public void setD_vistclamt(int d_vistclamt){
		this.d_vistclamt = d_vistclamt;
	}

	public void setD_giroauto_shiftclamt(int d_giroauto_shiftclamt){
		this.d_giroauto_shiftclamt = d_giroauto_shiftclamt;
	}

	public void setD_docard_shiftclamt(int d_docard_shiftclamt){
		this.d_docard_shiftclamt = d_docard_shiftclamt;
	}

	public void setD_gnrcard_shiftclamt(int d_gnrcard_shiftclamt){
		this.d_gnrcard_shiftclamt = d_gnrcard_shiftclamt;
	}

	public void setD_onlsetlclamt(int d_onlsetlclamt){
		this.d_onlsetlclamt = d_onlsetlclamt;
	}

	public void setD_etcclamt(int d_etcclamt){
		this.d_etcclamt = d_etcclamt;
	}

	public void setD_clamt_tot(int d_clamt_tot){
		this.d_clamt_tot = d_clamt_tot;
	}

	public void setPm_clamt_tot(int pm_clamt_tot){
		this.pm_clamt_tot = pm_clamt_tot;
	}

	public void setDpm_clamt_tot(int dpm_clamt_tot){
		this.dpm_clamt_tot = dpm_clamt_tot;
	}

	public void setD_arealeafclamt(int d_arealeafclamt){
		this.d_arealeafclamt = d_arealeafclamt;
	}

	public void setD_teampreisleafclamt(int d_teampreisleafclamt){
		this.d_teampreisleafclamt = d_teampreisleafclamt;
	}

	public void setD_leafclamt(int d_leafclamt){
		this.d_leafclamt = d_leafclamt;
	}

	public int getD_rdr_extnaplc(){
		return this.d_rdr_extnaplc;
	}

	public int getD_rdr_extnemp(){
		return this.d_rdr_extnemp;
	}

	public int getD_rdr_extnstaf(){
		return this.d_rdr_extnstaf;
	}

	public int getD_rdr_extnrdr_movm(){
		return this.d_rdr_extnrdr_movm;
	}

	public int getD_rdr_extnhdqt(){
		return this.d_rdr_extnhdqt;
	}

	public int getD_rdr_extn_tot(){
		return this.d_rdr_extn_tot;
	}

	public int getD_rdr_extnrate(){
		return this.d_rdr_extnrate;
	}

	public int getD_suspmovm(){
		return this.d_suspmovm;
	}

	public int getD_susprefu(){
		return this.d_susprefu;
	}

	public int getD_suspothnwsp(){
		return this.d_suspothnwsp;
	}

	public int getD_suspetc(){
		return this.d_suspetc;
	}

	public int getD_susp_tot(){
		return this.d_susp_tot;
	}

	public int getD_susprate(){
		return this.d_susprate;
	}

	public int getD_hmmsendqty(){
		return this.d_hmmsendqty;
	}

	public int getD_hmmvalqty(){
		return this.d_hmmvalqty;
	}

	public int getD_ftcnt1(){
		return this.d_ftcnt1;
	}

	public int getD_ftcnt2(){
		return this.d_ftcnt2;
	}

	public int getD_ftcnt3(){
		return this.d_ftcnt3;
	}

	public int getD_ftcnt4(){
		return this.d_ftcnt4;
	}

	public int getD_excsaftcnt6(){
		return this.d_excsaftcnt6;
	}

	public int getD_aftcnt_tot(){
		return this.d_aftcnt_tot;
	}

	public int getD_pub_infonwsp(){
		return this.d_pub_infonwsp;
	}

	public int getD_dntnwsp(){
		return this.d_dntnwsp;
	}

	public int getD_resvnwsp(){
		return this.d_resvnwsp;
	}

	public int getD_hmmsendqty1(){
		return this.d_hmmsendqty1;
	}

	public int getD_hmmsendqty2(){
		return this.d_hmmsendqty2;
	}

	public int getD_hmmsendqty3(){
		return this.d_hmmsendqty3;
	}

	public int getD_hmmsendqty4(){
		return this.d_hmmsendqty4;
	}

	public int getD_hmmsendqty5(){
		return this.d_hmmsendqty5;
	}

	public int getD_hmmsendqty_etc_tot(){
		return this.d_hmmsendqty_etc_tot;
	}

	public int getPm_hmmvalqtyb(){
		return this.pm_hmmvalqtyb;
	}

	public int getPm_aftcnt_totb(){
		return this.pm_aftcnt_totb;
	}

	public int getPm_val_totb(){
		return this.pm_val_totb;
	}

	public int getD_hmmvalqtyb(){
		return this.d_hmmvalqtyb;
	}

	public int getD_aftcnt_totb(){
		return this.d_aftcnt_totb;
	}

	public int getD_val_totb(){
		return this.d_val_totb;
	}

	public int getDpm_hmmvalqtyb(){
		return this.dpm_hmmvalqtyb;
	}

	public int getDpm_aftcnt_totb(){
		return this.dpm_aftcnt_totb;
	}

	public int getDpm_val_totb(){
		return this.dpm_val_totb;
	}

	public int getDpy_hmmvalqtyb(){
		return this.dpy_hmmvalqtyb;
	}

	public int getDpy_aftcnt_totb(){
		return this.dpy_aftcnt_totb;
	}

	public int getDpy_val_totb(){
		return this.dpy_val_totb;
	}

	public int getD_meda_amt(){
		return this.d_meda_amt;
	}

	public int getD_giroclamt(){
		return this.d_giroclamt;
	}

	public int getD_vistclamt(){
		return this.d_vistclamt;
	}

	public int getD_giroauto_shiftclamt(){
		return this.d_giroauto_shiftclamt;
	}

	public int getD_docard_shiftclamt(){
		return this.d_docard_shiftclamt;
	}

	public int getD_gnrcard_shiftclamt(){
		return this.d_gnrcard_shiftclamt;
	}

	public int getD_onlsetlclamt(){
		return this.d_onlsetlclamt;
	}

	public int getD_etcclamt(){
		return this.d_etcclamt;
	}

	public int getD_clamt_tot(){
		return this.d_clamt_tot;
	}

	public int getPm_clamt_tot(){
		return this.pm_clamt_tot;
	}

	public int getDpm_clamt_tot(){
		return this.dpm_clamt_tot;
	}

	public int getD_arealeafclamt(){
		return this.d_arealeafclamt;
	}

	public int getD_teampreisleafclamt(){
		return this.d_teampreisleafclamt;
	}

	public int getD_leafclamt(){
		return this.d_leafclamt;
	}
}

/* 작성시간 : Tue Mar 24 16:06:46 KST 2009 */