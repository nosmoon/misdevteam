/***************************************************************************************************
* ���ϸ� : .java
* ��� : 	   
* �ۼ����� : 
* �ۼ��� : 
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.se.rcp.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.rcp.ds.*;
import chosun.ciis.se.rcp.rec.*;

/**
 * 
 */


public class SE_RCP_4641_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String accflag;
	public String occr_dt;
	public String slip_clsf;
	public String seq;
	public String area_cd;
	public String mode_ar;
	public String bo_cd_ar;
	public String bo_seq_ar;
	public String net_sale_amt_ar;
	public String amt1_ar;
	public String amt2_ar;
	public String amt3_ar;
	public String amt4_ar;
	public String incmg_pers;
	public String incmg_pers_ip;

	public SE_RCP_4641_ADM(){}
	public SE_RCP_4641_ADM(String cmpy_cd, String accflag, String occr_dt, String slip_clsf, String seq, String area_cd, String mode_ar, String bo_cd_ar, String bo_seq_ar, String net_sale_amt_ar, String amt1_ar, String amt2_ar, String amt3_ar, String amt4_ar, String incmg_pers, String incmg_pers_ip){
		this.cmpy_cd = cmpy_cd;
		this.accflag = accflag;
		this.occr_dt = occr_dt;
		this.slip_clsf = slip_clsf;
		this.seq = seq;
		this.area_cd = area_cd;
		this.mode_ar = mode_ar;
		this.bo_cd_ar = bo_cd_ar;
		this.bo_seq_ar = bo_seq_ar;
		this.net_sale_amt_ar = net_sale_amt_ar;
		this.amt1_ar = amt1_ar;
		this.amt2_ar = amt2_ar;
		this.amt3_ar = amt3_ar;
		this.amt4_ar = amt4_ar;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAccflag(String accflag){
		this.accflag = accflag;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSlip_clsf(String slip_clsf){
		this.slip_clsf = slip_clsf;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setArea_cd(String area_cd){
		this.area_cd = area_cd;
	}

	public void setMode_ar(String mode_ar){
		this.mode_ar = mode_ar;
	}

	public void setBo_cd_ar(String bo_cd_ar){
		this.bo_cd_ar = bo_cd_ar;
	}

	public void setBo_seq_ar(String bo_seq_ar){
		this.bo_seq_ar = bo_seq_ar;
	}

	public void setNet_sale_amt_ar(String net_sale_amt_ar){
		this.net_sale_amt_ar = net_sale_amt_ar;
	}

	public void setAmt1_ar(String amt1_ar){
		this.amt1_ar = amt1_ar;
	}

	public void setAmt2_ar(String amt2_ar){
		this.amt2_ar = amt2_ar;
	}

	public void setAmt3_ar(String amt3_ar){
		this.amt3_ar = amt3_ar;
	}

	public void setAmt4_ar(String amt4_ar){
		this.amt4_ar = amt4_ar;
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

	public String getAccflag(){
		return this.accflag;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSlip_clsf(){
		return this.slip_clsf;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getArea_cd(){
		return this.area_cd;
	}

	public String getMode_ar(){
		return this.mode_ar;
	}

	public String getBo_cd_ar(){
		return this.bo_cd_ar;
	}

	public String getBo_seq_ar(){
		return this.bo_seq_ar;
	}

	public String getNet_sale_amt_ar(){
		return this.net_sale_amt_ar;
	}

	public String getAmt1_ar(){
		return this.amt1_ar;
	}

	public String getAmt2_ar(){
		return this.amt2_ar;
	}

	public String getAmt3_ar(){
		return this.amt3_ar;
	}

	public String getAmt4_ar(){
		return this.amt4_ar;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SE_RCP_4641_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_RCP_4641_ADM dm = (SE_RCP_4641_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.accflag);
		cstmt.setString(5, dm.occr_dt);
		cstmt.setString(6, dm.slip_clsf);
		cstmt.setString(7, dm.seq);
		cstmt.setString(8, dm.area_cd);
		cstmt.setString(9, dm.mode_ar);
		cstmt.setString(10, dm.bo_cd_ar);
		cstmt.setString(11, dm.bo_seq_ar);
		cstmt.setString(12, dm.net_sale_amt_ar);
		cstmt.setString(13, dm.amt1_ar);
		cstmt.setString(14, dm.amt2_ar);
		cstmt.setString(15, dm.amt3_ar);
		cstmt.setString(16, dm.amt4_ar);
		cstmt.setString(17, dm.incmg_pers);
		cstmt.setString(18, dm.incmg_pers_ip);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.rcp.ds.SE_RCP_4641_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("accflag = [" + getAccflag() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("slip_clsf = [" + getSlip_clsf() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("area_cd = [" + getArea_cd() + "]");
		System.out.println("mode_ar = [" + getMode_ar() + "]");
		System.out.println("bo_cd_ar = [" + getBo_cd_ar() + "]");
		System.out.println("bo_seq_ar = [" + getBo_seq_ar() + "]");
		System.out.println("net_sale_amt_ar = [" + getNet_sale_amt_ar() + "]");
		System.out.println("amt1_ar = [" + getAmt1_ar() + "]");
		System.out.println("amt2_ar = [" + getAmt2_ar() + "]");
		System.out.println("amt3_ar = [" + getAmt3_ar() + "]");
		System.out.println("amt4_ar = [" + getAmt4_ar() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String accflag = req.getParameter("accflag");
if( accflag == null){
	System.out.println(this.toString+" : accflag is null" );
}else{
	System.out.println(this.toString+" : accflag is "+accflag );
}
String occr_dt = req.getParameter("occr_dt");
if( occr_dt == null){
	System.out.println(this.toString+" : occr_dt is null" );
}else{
	System.out.println(this.toString+" : occr_dt is "+occr_dt );
}
String slip_clsf = req.getParameter("slip_clsf");
if( slip_clsf == null){
	System.out.println(this.toString+" : slip_clsf is null" );
}else{
	System.out.println(this.toString+" : slip_clsf is "+slip_clsf );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String area_cd = req.getParameter("area_cd");
if( area_cd == null){
	System.out.println(this.toString+" : area_cd is null" );
}else{
	System.out.println(this.toString+" : area_cd is "+area_cd );
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
String bo_seq_ar = req.getParameter("bo_seq_ar");
if( bo_seq_ar == null){
	System.out.println(this.toString+" : bo_seq_ar is null" );
}else{
	System.out.println(this.toString+" : bo_seq_ar is "+bo_seq_ar );
}
String net_sale_amt_ar = req.getParameter("net_sale_amt_ar");
if( net_sale_amt_ar == null){
	System.out.println(this.toString+" : net_sale_amt_ar is null" );
}else{
	System.out.println(this.toString+" : net_sale_amt_ar is "+net_sale_amt_ar );
}
String amt1_ar = req.getParameter("amt1_ar");
if( amt1_ar == null){
	System.out.println(this.toString+" : amt1_ar is null" );
}else{
	System.out.println(this.toString+" : amt1_ar is "+amt1_ar );
}
String amt2_ar = req.getParameter("amt2_ar");
if( amt2_ar == null){
	System.out.println(this.toString+" : amt2_ar is null" );
}else{
	System.out.println(this.toString+" : amt2_ar is "+amt2_ar );
}
String amt3_ar = req.getParameter("amt3_ar");
if( amt3_ar == null){
	System.out.println(this.toString+" : amt3_ar is null" );
}else{
	System.out.println(this.toString+" : amt3_ar is "+amt3_ar );
}
String amt4_ar = req.getParameter("amt4_ar");
if( amt4_ar == null){
	System.out.println(this.toString+" : amt4_ar is null" );
}else{
	System.out.println(this.toString+" : amt4_ar is "+amt4_ar );
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
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String accflag = Util.checkString(req.getParameter("accflag"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String slip_clsf = Util.checkString(req.getParameter("slip_clsf"));
String seq = Util.checkString(req.getParameter("seq"));
String area_cd = Util.checkString(req.getParameter("area_cd"));
String mode_ar = Util.checkString(req.getParameter("mode_ar"));
String bo_cd_ar = Util.checkString(req.getParameter("bo_cd_ar"));
String bo_seq_ar = Util.checkString(req.getParameter("bo_seq_ar"));
String net_sale_amt_ar = Util.checkString(req.getParameter("net_sale_amt_ar"));
String amt1_ar = Util.checkString(req.getParameter("amt1_ar"));
String amt2_ar = Util.checkString(req.getParameter("amt2_ar"));
String amt3_ar = Util.checkString(req.getParameter("amt3_ar"));
String amt4_ar = Util.checkString(req.getParameter("amt4_ar"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String accflag = Util.Uni2Ksc(Util.checkString(req.getParameter("accflag")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String slip_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String area_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("area_cd")));
String mode_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("mode_ar")));
String bo_cd_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_cd_ar")));
String bo_seq_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_seq_ar")));
String net_sale_amt_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("net_sale_amt_ar")));
String amt1_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("amt1_ar")));
String amt2_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("amt2_ar")));
String amt3_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("amt3_ar")));
String amt4_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("amt4_ar")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setAccflag(accflag);
dm.setOccr_dt(occr_dt);
dm.setSlip_clsf(slip_clsf);
dm.setSeq(seq);
dm.setArea_cd(area_cd);
dm.setMode_ar(mode_ar);
dm.setBo_cd_ar(bo_cd_ar);
dm.setBo_seq_ar(bo_seq_ar);
dm.setNet_sale_amt_ar(net_sale_amt_ar);
dm.setAmt1_ar(amt1_ar);
dm.setAmt2_ar(amt2_ar);
dm.setAmt3_ar(amt3_ar);
dm.setAmt4_ar(amt4_ar);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ip(incmg_pers_ip);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Jul 07 16:05:27 KST 2017 */