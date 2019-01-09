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


public class FC_ACCT_6272_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String flag;
	public String incmg_pers;
	public String incmg_pers_ipadd;
	public String cmpy_cd;
	public String erplace_cd;
	public String vat_fr_yymm;
	public String vat_to_yymm;
	public long v_secn_21_010;
	public long v_secn_21_020;
	public long v_secn_21_030;
	public long v_secn_21_040;
	public long v_secn_21_050;
	public long v_secn_22_010;
	public long v_secn_23_010;
	public long v_secn_23_020;
	public long v_secn_24_010;
	public long v_secn_24_020;
	public long v_secn_24_030;
	public long v_secn_24_040;
	public long v_secn_24_050;
	public long v_secn_24_060;
	public long v_secn_24_070;
	public long v_secn_24_080;
	public long v_secn_tot_amt;
	public long j_secn_105_1_1;
	public long j_secn_105_1_3;
	public long j_secn_105_1_32;
	public long j_secn_105_1_4;
	public long j_secn_105_1_5;
	public long j_secn_107;
	public long j_secn_121_13;
	public long j_secn_tot_amt;
	public long tot_amt;

	public FC_ACCT_6272_ADM(){}
	public FC_ACCT_6272_ADM(String flag, String incmg_pers, String incmg_pers_ipadd, String cmpy_cd, String erplace_cd, String vat_fr_yymm, String vat_to_yymm, long v_secn_21_010, long v_secn_21_020, long v_secn_21_030, long v_secn_21_040, long v_secn_21_050, long v_secn_22_010, long v_secn_23_010, long v_secn_23_020, long v_secn_24_010, long v_secn_24_020, long v_secn_24_030, long v_secn_24_040, long v_secn_24_050, long v_secn_24_060, long v_secn_24_070, long v_secn_24_080, long v_secn_tot_amt, long j_secn_105_1_1, long j_secn_105_1_3, long j_secn_105_1_32, long j_secn_105_1_4, long j_secn_105_1_5, long j_secn_107, long j_secn_121_13, long j_secn_tot_amt, long tot_amt){
		this.flag = flag;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.cmpy_cd = cmpy_cd;
		this.erplace_cd = erplace_cd;
		this.vat_fr_yymm = vat_fr_yymm;
		this.vat_to_yymm = vat_to_yymm;
		this.v_secn_21_010 = v_secn_21_010;
		this.v_secn_21_020 = v_secn_21_020;
		this.v_secn_21_030 = v_secn_21_030;
		this.v_secn_21_040 = v_secn_21_040;
		this.v_secn_21_050 = v_secn_21_050;
		this.v_secn_22_010 = v_secn_22_010;
		this.v_secn_23_010 = v_secn_23_010;
		this.v_secn_23_020 = v_secn_23_020;
		this.v_secn_24_010 = v_secn_24_010;
		this.v_secn_24_020 = v_secn_24_020;
		this.v_secn_24_030 = v_secn_24_030;
		this.v_secn_24_040 = v_secn_24_040;
		this.v_secn_24_050 = v_secn_24_050;
		this.v_secn_24_060 = v_secn_24_060;
		this.v_secn_24_070 = v_secn_24_070;
		this.v_secn_24_080 = v_secn_24_080;
		this.v_secn_tot_amt = v_secn_tot_amt;
		this.j_secn_105_1_1 = j_secn_105_1_1;
		this.j_secn_105_1_3 = j_secn_105_1_3;
		this.j_secn_105_1_32 = j_secn_105_1_32;
		this.j_secn_105_1_4 = j_secn_105_1_4;
		this.j_secn_105_1_5 = j_secn_105_1_5;
		this.j_secn_107 = j_secn_107;
		this.j_secn_121_13 = j_secn_121_13;
		this.j_secn_tot_amt = j_secn_tot_amt;
		this.tot_amt = tot_amt;
	}

	public void setFlag(String flag){
		this.flag = flag;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setErplace_cd(String erplace_cd){
		this.erplace_cd = erplace_cd;
	}

	public void setVat_fr_yymm(String vat_fr_yymm){
		this.vat_fr_yymm = vat_fr_yymm;
	}

	public void setVat_to_yymm(String vat_to_yymm){
		this.vat_to_yymm = vat_to_yymm;
	}

	public void setV_secn_21_010(long v_secn_21_010){
		this.v_secn_21_010 = v_secn_21_010;
	}

	public void setV_secn_21_020(long v_secn_21_020){
		this.v_secn_21_020 = v_secn_21_020;
	}

	public void setV_secn_21_030(long v_secn_21_030){
		this.v_secn_21_030 = v_secn_21_030;
	}

	public void setV_secn_21_040(long v_secn_21_040){
		this.v_secn_21_040 = v_secn_21_040;
	}

	public void setV_secn_21_050(long v_secn_21_050){
		this.v_secn_21_050 = v_secn_21_050;
	}

	public void setV_secn_22_010(long v_secn_22_010){
		this.v_secn_22_010 = v_secn_22_010;
	}

	public void setV_secn_23_010(long v_secn_23_010){
		this.v_secn_23_010 = v_secn_23_010;
	}

	public void setV_secn_23_020(long v_secn_23_020){
		this.v_secn_23_020 = v_secn_23_020;
	}

	public void setV_secn_24_010(long v_secn_24_010){
		this.v_secn_24_010 = v_secn_24_010;
	}

	public void setV_secn_24_020(long v_secn_24_020){
		this.v_secn_24_020 = v_secn_24_020;
	}

	public void setV_secn_24_030(long v_secn_24_030){
		this.v_secn_24_030 = v_secn_24_030;
	}

	public void setV_secn_24_040(long v_secn_24_040){
		this.v_secn_24_040 = v_secn_24_040;
	}

	public void setV_secn_24_050(long v_secn_24_050){
		this.v_secn_24_050 = v_secn_24_050;
	}

	public void setV_secn_24_060(long v_secn_24_060){
		this.v_secn_24_060 = v_secn_24_060;
	}

	public void setV_secn_24_070(long v_secn_24_070){
		this.v_secn_24_070 = v_secn_24_070;
	}

	public void setV_secn_24_080(long v_secn_24_080){
		this.v_secn_24_080 = v_secn_24_080;
	}

	public void setV_secn_tot_amt(long v_secn_tot_amt){
		this.v_secn_tot_amt = v_secn_tot_amt;
	}

	public void setJ_secn_105_1_1(long j_secn_105_1_1){
		this.j_secn_105_1_1 = j_secn_105_1_1;
	}

	public void setJ_secn_105_1_3(long j_secn_105_1_3){
		this.j_secn_105_1_3 = j_secn_105_1_3;
	}

	public void setJ_secn_105_1_32(long j_secn_105_1_32){
		this.j_secn_105_1_32 = j_secn_105_1_32;
	}

	public void setJ_secn_105_1_4(long j_secn_105_1_4){
		this.j_secn_105_1_4 = j_secn_105_1_4;
	}

	public void setJ_secn_105_1_5(long j_secn_105_1_5){
		this.j_secn_105_1_5 = j_secn_105_1_5;
	}

	public void setJ_secn_107(long j_secn_107){
		this.j_secn_107 = j_secn_107;
	}

	public void setJ_secn_121_13(long j_secn_121_13){
		this.j_secn_121_13 = j_secn_121_13;
	}

	public void setJ_secn_tot_amt(long j_secn_tot_amt){
		this.j_secn_tot_amt = j_secn_tot_amt;
	}

	public void setTot_amt(long tot_amt){
		this.tot_amt = tot_amt;
	}

	public String getFlag(){
		return this.flag;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getErplace_cd(){
		return this.erplace_cd;
	}

	public String getVat_fr_yymm(){
		return this.vat_fr_yymm;
	}

	public String getVat_to_yymm(){
		return this.vat_to_yymm;
	}

	public long getV_secn_21_010(){
		return this.v_secn_21_010;
	}

	public long getV_secn_21_020(){
		return this.v_secn_21_020;
	}

	public long getV_secn_21_030(){
		return this.v_secn_21_030;
	}

	public long getV_secn_21_040(){
		return this.v_secn_21_040;
	}

	public long getV_secn_21_050(){
		return this.v_secn_21_050;
	}

	public long getV_secn_22_010(){
		return this.v_secn_22_010;
	}

	public long getV_secn_23_010(){
		return this.v_secn_23_010;
	}

	public long getV_secn_23_020(){
		return this.v_secn_23_020;
	}

	public long getV_secn_24_010(){
		return this.v_secn_24_010;
	}

	public long getV_secn_24_020(){
		return this.v_secn_24_020;
	}

	public long getV_secn_24_030(){
		return this.v_secn_24_030;
	}

	public long getV_secn_24_040(){
		return this.v_secn_24_040;
	}

	public long getV_secn_24_050(){
		return this.v_secn_24_050;
	}

	public long getV_secn_24_060(){
		return this.v_secn_24_060;
	}

	public long getV_secn_24_070(){
		return this.v_secn_24_070;
	}

	public long getV_secn_24_080(){
		return this.v_secn_24_080;
	}

	public long getV_secn_tot_amt(){
		return this.v_secn_tot_amt;
	}

	public long getJ_secn_105_1_1(){
		return this.j_secn_105_1_1;
	}

	public long getJ_secn_105_1_3(){
		return this.j_secn_105_1_3;
	}

	public long getJ_secn_105_1_32(){
		return this.j_secn_105_1_32;
	}

	public long getJ_secn_105_1_4(){
		return this.j_secn_105_1_4;
	}

	public long getJ_secn_105_1_5(){
		return this.j_secn_105_1_5;
	}

	public long getJ_secn_107(){
		return this.j_secn_107;
	}

	public long getJ_secn_121_13(){
		return this.j_secn_121_13;
	}

	public long getJ_secn_tot_amt(){
		return this.j_secn_tot_amt;
	}

	public long getTot_amt(){
		return this.tot_amt;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_6272_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_6272_ADM dm = (FC_ACCT_6272_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.flag);
		cstmt.setString(4, dm.incmg_pers);
		cstmt.setString(5, dm.incmg_pers_ipadd);
		cstmt.setString(6, dm.cmpy_cd);
		cstmt.setString(7, dm.erplace_cd);
		cstmt.setString(8, dm.vat_fr_yymm);
		cstmt.setString(9, dm.vat_to_yymm);
		cstmt.setLong(10, dm.v_secn_21_010);
		cstmt.setLong(11, dm.v_secn_21_020);
		cstmt.setLong(12, dm.v_secn_21_030);
		cstmt.setLong(13, dm.v_secn_21_040);
		cstmt.setLong(14, dm.v_secn_21_050);
		cstmt.setLong(15, dm.v_secn_22_010);
		cstmt.setLong(16, dm.v_secn_23_010);
		cstmt.setLong(17, dm.v_secn_23_020);
		cstmt.setLong(18, dm.v_secn_24_010);
		cstmt.setLong(19, dm.v_secn_24_020);
		cstmt.setLong(20, dm.v_secn_24_030);
		cstmt.setLong(21, dm.v_secn_24_040);
		cstmt.setLong(22, dm.v_secn_24_050);
		cstmt.setLong(23, dm.v_secn_24_060);
		cstmt.setLong(24, dm.v_secn_24_070);
		cstmt.setLong(25, dm.v_secn_24_080);
		cstmt.setLong(26, dm.v_secn_tot_amt);
		cstmt.setLong(27, dm.j_secn_105_1_1);
		cstmt.setLong(28, dm.j_secn_105_1_3);
		cstmt.setLong(29, dm.j_secn_105_1_32);
		cstmt.setLong(30, dm.j_secn_105_1_4);
		cstmt.setLong(31, dm.j_secn_105_1_5);
		cstmt.setLong(32, dm.j_secn_107);
		cstmt.setLong(33, dm.j_secn_121_13);
		cstmt.setLong(34, dm.j_secn_tot_amt);
		cstmt.setLong(35, dm.tot_amt);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_6272_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("flag = [" + getFlag() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("erplace_cd = [" + getErplace_cd() + "]");
		System.out.println("vat_fr_yymm = [" + getVat_fr_yymm() + "]");
		System.out.println("vat_to_yymm = [" + getVat_to_yymm() + "]");
		System.out.println("v_secn_21_010 = [" + getV_secn_21_010() + "]");
		System.out.println("v_secn_21_020 = [" + getV_secn_21_020() + "]");
		System.out.println("v_secn_21_030 = [" + getV_secn_21_030() + "]");
		System.out.println("v_secn_21_040 = [" + getV_secn_21_040() + "]");
		System.out.println("v_secn_21_050 = [" + getV_secn_21_050() + "]");
		System.out.println("v_secn_22_010 = [" + getV_secn_22_010() + "]");
		System.out.println("v_secn_23_010 = [" + getV_secn_23_010() + "]");
		System.out.println("v_secn_23_020 = [" + getV_secn_23_020() + "]");
		System.out.println("v_secn_24_010 = [" + getV_secn_24_010() + "]");
		System.out.println("v_secn_24_020 = [" + getV_secn_24_020() + "]");
		System.out.println("v_secn_24_030 = [" + getV_secn_24_030() + "]");
		System.out.println("v_secn_24_040 = [" + getV_secn_24_040() + "]");
		System.out.println("v_secn_24_050 = [" + getV_secn_24_050() + "]");
		System.out.println("v_secn_24_060 = [" + getV_secn_24_060() + "]");
		System.out.println("v_secn_24_070 = [" + getV_secn_24_070() + "]");
		System.out.println("v_secn_24_080 = [" + getV_secn_24_080() + "]");
		System.out.println("v_secn_tot_amt = [" + getV_secn_tot_amt() + "]");
		System.out.println("j_secn_105_1_1 = [" + getJ_secn_105_1_1() + "]");
		System.out.println("j_secn_105_1_3 = [" + getJ_secn_105_1_3() + "]");
		System.out.println("j_secn_105_1_32 = [" + getJ_secn_105_1_32() + "]");
		System.out.println("j_secn_105_1_4 = [" + getJ_secn_105_1_4() + "]");
		System.out.println("j_secn_105_1_5 = [" + getJ_secn_105_1_5() + "]");
		System.out.println("j_secn_107 = [" + getJ_secn_107() + "]");
		System.out.println("j_secn_121_13 = [" + getJ_secn_121_13() + "]");
		System.out.println("j_secn_tot_amt = [" + getJ_secn_tot_amt() + "]");
		System.out.println("tot_amt = [" + getTot_amt() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String flag = req.getParameter("flag");
if( flag == null){
	System.out.println(this.toString+" : flag is null" );
}else{
	System.out.println(this.toString+" : flag is "+flag );
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
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String erplace_cd = req.getParameter("erplace_cd");
if( erplace_cd == null){
	System.out.println(this.toString+" : erplace_cd is null" );
}else{
	System.out.println(this.toString+" : erplace_cd is "+erplace_cd );
}
String vat_fr_yymm = req.getParameter("vat_fr_yymm");
if( vat_fr_yymm == null){
	System.out.println(this.toString+" : vat_fr_yymm is null" );
}else{
	System.out.println(this.toString+" : vat_fr_yymm is "+vat_fr_yymm );
}
String vat_to_yymm = req.getParameter("vat_to_yymm");
if( vat_to_yymm == null){
	System.out.println(this.toString+" : vat_to_yymm is null" );
}else{
	System.out.println(this.toString+" : vat_to_yymm is "+vat_to_yymm );
}
String v_secn_21_010 = req.getParameter("v_secn_21_010");
if( v_secn_21_010 == null){
	System.out.println(this.toString+" : v_secn_21_010 is null" );
}else{
	System.out.println(this.toString+" : v_secn_21_010 is "+v_secn_21_010 );
}
String v_secn_21_020 = req.getParameter("v_secn_21_020");
if( v_secn_21_020 == null){
	System.out.println(this.toString+" : v_secn_21_020 is null" );
}else{
	System.out.println(this.toString+" : v_secn_21_020 is "+v_secn_21_020 );
}
String v_secn_21_030 = req.getParameter("v_secn_21_030");
if( v_secn_21_030 == null){
	System.out.println(this.toString+" : v_secn_21_030 is null" );
}else{
	System.out.println(this.toString+" : v_secn_21_030 is "+v_secn_21_030 );
}
String v_secn_21_040 = req.getParameter("v_secn_21_040");
if( v_secn_21_040 == null){
	System.out.println(this.toString+" : v_secn_21_040 is null" );
}else{
	System.out.println(this.toString+" : v_secn_21_040 is "+v_secn_21_040 );
}
String v_secn_21_050 = req.getParameter("v_secn_21_050");
if( v_secn_21_050 == null){
	System.out.println(this.toString+" : v_secn_21_050 is null" );
}else{
	System.out.println(this.toString+" : v_secn_21_050 is "+v_secn_21_050 );
}
String v_secn_22_010 = req.getParameter("v_secn_22_010");
if( v_secn_22_010 == null){
	System.out.println(this.toString+" : v_secn_22_010 is null" );
}else{
	System.out.println(this.toString+" : v_secn_22_010 is "+v_secn_22_010 );
}
String v_secn_23_010 = req.getParameter("v_secn_23_010");
if( v_secn_23_010 == null){
	System.out.println(this.toString+" : v_secn_23_010 is null" );
}else{
	System.out.println(this.toString+" : v_secn_23_010 is "+v_secn_23_010 );
}
String v_secn_23_020 = req.getParameter("v_secn_23_020");
if( v_secn_23_020 == null){
	System.out.println(this.toString+" : v_secn_23_020 is null" );
}else{
	System.out.println(this.toString+" : v_secn_23_020 is "+v_secn_23_020 );
}
String v_secn_24_010 = req.getParameter("v_secn_24_010");
if( v_secn_24_010 == null){
	System.out.println(this.toString+" : v_secn_24_010 is null" );
}else{
	System.out.println(this.toString+" : v_secn_24_010 is "+v_secn_24_010 );
}
String v_secn_24_020 = req.getParameter("v_secn_24_020");
if( v_secn_24_020 == null){
	System.out.println(this.toString+" : v_secn_24_020 is null" );
}else{
	System.out.println(this.toString+" : v_secn_24_020 is "+v_secn_24_020 );
}
String v_secn_24_030 = req.getParameter("v_secn_24_030");
if( v_secn_24_030 == null){
	System.out.println(this.toString+" : v_secn_24_030 is null" );
}else{
	System.out.println(this.toString+" : v_secn_24_030 is "+v_secn_24_030 );
}
String v_secn_24_040 = req.getParameter("v_secn_24_040");
if( v_secn_24_040 == null){
	System.out.println(this.toString+" : v_secn_24_040 is null" );
}else{
	System.out.println(this.toString+" : v_secn_24_040 is "+v_secn_24_040 );
}
String v_secn_24_050 = req.getParameter("v_secn_24_050");
if( v_secn_24_050 == null){
	System.out.println(this.toString+" : v_secn_24_050 is null" );
}else{
	System.out.println(this.toString+" : v_secn_24_050 is "+v_secn_24_050 );
}
String v_secn_24_060 = req.getParameter("v_secn_24_060");
if( v_secn_24_060 == null){
	System.out.println(this.toString+" : v_secn_24_060 is null" );
}else{
	System.out.println(this.toString+" : v_secn_24_060 is "+v_secn_24_060 );
}
String v_secn_24_070 = req.getParameter("v_secn_24_070");
if( v_secn_24_070 == null){
	System.out.println(this.toString+" : v_secn_24_070 is null" );
}else{
	System.out.println(this.toString+" : v_secn_24_070 is "+v_secn_24_070 );
}
String v_secn_24_080 = req.getParameter("v_secn_24_080");
if( v_secn_24_080 == null){
	System.out.println(this.toString+" : v_secn_24_080 is null" );
}else{
	System.out.println(this.toString+" : v_secn_24_080 is "+v_secn_24_080 );
}
String v_secn_tot_amt = req.getParameter("v_secn_tot_amt");
if( v_secn_tot_amt == null){
	System.out.println(this.toString+" : v_secn_tot_amt is null" );
}else{
	System.out.println(this.toString+" : v_secn_tot_amt is "+v_secn_tot_amt );
}
String j_secn_105_1_1 = req.getParameter("j_secn_105_1_1");
if( j_secn_105_1_1 == null){
	System.out.println(this.toString+" : j_secn_105_1_1 is null" );
}else{
	System.out.println(this.toString+" : j_secn_105_1_1 is "+j_secn_105_1_1 );
}
String j_secn_105_1_3 = req.getParameter("j_secn_105_1_3");
if( j_secn_105_1_3 == null){
	System.out.println(this.toString+" : j_secn_105_1_3 is null" );
}else{
	System.out.println(this.toString+" : j_secn_105_1_3 is "+j_secn_105_1_3 );
}
String j_secn_105_1_32 = req.getParameter("j_secn_105_1_32");
if( j_secn_105_1_32 == null){
	System.out.println(this.toString+" : j_secn_105_1_32 is null" );
}else{
	System.out.println(this.toString+" : j_secn_105_1_32 is "+j_secn_105_1_32 );
}
String j_secn_105_1_4 = req.getParameter("j_secn_105_1_4");
if( j_secn_105_1_4 == null){
	System.out.println(this.toString+" : j_secn_105_1_4 is null" );
}else{
	System.out.println(this.toString+" : j_secn_105_1_4 is "+j_secn_105_1_4 );
}
String j_secn_105_1_5 = req.getParameter("j_secn_105_1_5");
if( j_secn_105_1_5 == null){
	System.out.println(this.toString+" : j_secn_105_1_5 is null" );
}else{
	System.out.println(this.toString+" : j_secn_105_1_5 is "+j_secn_105_1_5 );
}
String j_secn_107 = req.getParameter("j_secn_107");
if( j_secn_107 == null){
	System.out.println(this.toString+" : j_secn_107 is null" );
}else{
	System.out.println(this.toString+" : j_secn_107 is "+j_secn_107 );
}
String j_secn_121_13 = req.getParameter("j_secn_121_13");
if( j_secn_121_13 == null){
	System.out.println(this.toString+" : j_secn_121_13 is null" );
}else{
	System.out.println(this.toString+" : j_secn_121_13 is "+j_secn_121_13 );
}
String j_secn_tot_amt = req.getParameter("j_secn_tot_amt");
if( j_secn_tot_amt == null){
	System.out.println(this.toString+" : j_secn_tot_amt is null" );
}else{
	System.out.println(this.toString+" : j_secn_tot_amt is "+j_secn_tot_amt );
}
String tot_amt = req.getParameter("tot_amt");
if( tot_amt == null){
	System.out.println(this.toString+" : tot_amt is null" );
}else{
	System.out.println(this.toString+" : tot_amt is "+tot_amt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String flag = Util.checkString(req.getParameter("flag"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String erplace_cd = Util.checkString(req.getParameter("erplace_cd"));
String vat_fr_yymm = Util.checkString(req.getParameter("vat_fr_yymm"));
String vat_to_yymm = Util.checkString(req.getParameter("vat_to_yymm"));
String v_secn_21_010 = Util.checkString(req.getParameter("v_secn_21_010"));
String v_secn_21_020 = Util.checkString(req.getParameter("v_secn_21_020"));
String v_secn_21_030 = Util.checkString(req.getParameter("v_secn_21_030"));
String v_secn_21_040 = Util.checkString(req.getParameter("v_secn_21_040"));
String v_secn_21_050 = Util.checkString(req.getParameter("v_secn_21_050"));
String v_secn_22_010 = Util.checkString(req.getParameter("v_secn_22_010"));
String v_secn_23_010 = Util.checkString(req.getParameter("v_secn_23_010"));
String v_secn_23_020 = Util.checkString(req.getParameter("v_secn_23_020"));
String v_secn_24_010 = Util.checkString(req.getParameter("v_secn_24_010"));
String v_secn_24_020 = Util.checkString(req.getParameter("v_secn_24_020"));
String v_secn_24_030 = Util.checkString(req.getParameter("v_secn_24_030"));
String v_secn_24_040 = Util.checkString(req.getParameter("v_secn_24_040"));
String v_secn_24_050 = Util.checkString(req.getParameter("v_secn_24_050"));
String v_secn_24_060 = Util.checkString(req.getParameter("v_secn_24_060"));
String v_secn_24_070 = Util.checkString(req.getParameter("v_secn_24_070"));
String v_secn_24_080 = Util.checkString(req.getParameter("v_secn_24_080"));
String v_secn_tot_amt = Util.checkString(req.getParameter("v_secn_tot_amt"));
String j_secn_105_1_1 = Util.checkString(req.getParameter("j_secn_105_1_1"));
String j_secn_105_1_3 = Util.checkString(req.getParameter("j_secn_105_1_3"));
String j_secn_105_1_32 = Util.checkString(req.getParameter("j_secn_105_1_32"));
String j_secn_105_1_4 = Util.checkString(req.getParameter("j_secn_105_1_4"));
String j_secn_105_1_5 = Util.checkString(req.getParameter("j_secn_105_1_5"));
String j_secn_107 = Util.checkString(req.getParameter("j_secn_107"));
String j_secn_121_13 = Util.checkString(req.getParameter("j_secn_121_13"));
String j_secn_tot_amt = Util.checkString(req.getParameter("j_secn_tot_amt"));
String tot_amt = Util.checkString(req.getParameter("tot_amt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String flag = Util.Uni2Ksc(Util.checkString(req.getParameter("flag")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String erplace_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("erplace_cd")));
String vat_fr_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("vat_fr_yymm")));
String vat_to_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("vat_to_yymm")));
String v_secn_21_010 = Util.Uni2Ksc(Util.checkString(req.getParameter("v_secn_21_010")));
String v_secn_21_020 = Util.Uni2Ksc(Util.checkString(req.getParameter("v_secn_21_020")));
String v_secn_21_030 = Util.Uni2Ksc(Util.checkString(req.getParameter("v_secn_21_030")));
String v_secn_21_040 = Util.Uni2Ksc(Util.checkString(req.getParameter("v_secn_21_040")));
String v_secn_21_050 = Util.Uni2Ksc(Util.checkString(req.getParameter("v_secn_21_050")));
String v_secn_22_010 = Util.Uni2Ksc(Util.checkString(req.getParameter("v_secn_22_010")));
String v_secn_23_010 = Util.Uni2Ksc(Util.checkString(req.getParameter("v_secn_23_010")));
String v_secn_23_020 = Util.Uni2Ksc(Util.checkString(req.getParameter("v_secn_23_020")));
String v_secn_24_010 = Util.Uni2Ksc(Util.checkString(req.getParameter("v_secn_24_010")));
String v_secn_24_020 = Util.Uni2Ksc(Util.checkString(req.getParameter("v_secn_24_020")));
String v_secn_24_030 = Util.Uni2Ksc(Util.checkString(req.getParameter("v_secn_24_030")));
String v_secn_24_040 = Util.Uni2Ksc(Util.checkString(req.getParameter("v_secn_24_040")));
String v_secn_24_050 = Util.Uni2Ksc(Util.checkString(req.getParameter("v_secn_24_050")));
String v_secn_24_060 = Util.Uni2Ksc(Util.checkString(req.getParameter("v_secn_24_060")));
String v_secn_24_070 = Util.Uni2Ksc(Util.checkString(req.getParameter("v_secn_24_070")));
String v_secn_24_080 = Util.Uni2Ksc(Util.checkString(req.getParameter("v_secn_24_080")));
String v_secn_tot_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("v_secn_tot_amt")));
String j_secn_105_1_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("j_secn_105_1_1")));
String j_secn_105_1_3 = Util.Uni2Ksc(Util.checkString(req.getParameter("j_secn_105_1_3")));
String j_secn_105_1_32 = Util.Uni2Ksc(Util.checkString(req.getParameter("j_secn_105_1_32")));
String j_secn_105_1_4 = Util.Uni2Ksc(Util.checkString(req.getParameter("j_secn_105_1_4")));
String j_secn_105_1_5 = Util.Uni2Ksc(Util.checkString(req.getParameter("j_secn_105_1_5")));
String j_secn_107 = Util.Uni2Ksc(Util.checkString(req.getParameter("j_secn_107")));
String j_secn_121_13 = Util.Uni2Ksc(Util.checkString(req.getParameter("j_secn_121_13")));
String j_secn_tot_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("j_secn_tot_amt")));
String tot_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("tot_amt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setFlag(flag);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setCmpy_cd(cmpy_cd);
dm.setErplace_cd(erplace_cd);
dm.setVat_fr_yymm(vat_fr_yymm);
dm.setVat_to_yymm(vat_to_yymm);
dm.setV_secn_21_010(v_secn_21_010);
dm.setV_secn_21_020(v_secn_21_020);
dm.setV_secn_21_030(v_secn_21_030);
dm.setV_secn_21_040(v_secn_21_040);
dm.setV_secn_21_050(v_secn_21_050);
dm.setV_secn_22_010(v_secn_22_010);
dm.setV_secn_23_010(v_secn_23_010);
dm.setV_secn_23_020(v_secn_23_020);
dm.setV_secn_24_010(v_secn_24_010);
dm.setV_secn_24_020(v_secn_24_020);
dm.setV_secn_24_030(v_secn_24_030);
dm.setV_secn_24_040(v_secn_24_040);
dm.setV_secn_24_050(v_secn_24_050);
dm.setV_secn_24_060(v_secn_24_060);
dm.setV_secn_24_070(v_secn_24_070);
dm.setV_secn_24_080(v_secn_24_080);
dm.setV_secn_tot_amt(v_secn_tot_amt);
dm.setJ_secn_105_1_1(j_secn_105_1_1);
dm.setJ_secn_105_1_3(j_secn_105_1_3);
dm.setJ_secn_105_1_32(j_secn_105_1_32);
dm.setJ_secn_105_1_4(j_secn_105_1_4);
dm.setJ_secn_105_1_5(j_secn_105_1_5);
dm.setJ_secn_107(j_secn_107);
dm.setJ_secn_121_13(j_secn_121_13);
dm.setJ_secn_tot_amt(j_secn_tot_amt);
dm.setTot_amt(tot_amt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jun 10 19:28:29 KST 2014 */