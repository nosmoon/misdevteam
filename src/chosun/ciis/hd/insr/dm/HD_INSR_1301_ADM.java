/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���ڿ��-������û
* �ۼ����� : 2007-05-22
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.hd.insr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.insr.ds.*;
import chosun.ciis.hd.insr.rec.*;

/**
 * 
 */


public class HD_INSR_1301_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String search_yyyymm;
	public String prn;
	public String hlth_insr_fee;
	public String hlth_insr_med_fee;
	public String incmg_pers_ipadd;
	public String incmg_pers;
	public String chg_pers;
	public String flag;

	public HD_INSR_1301_ADM(){}
	public HD_INSR_1301_ADM(String cmpy_cd, String search_yyyymm, String prn, String hlth_insr_fee, String hlth_insr_med_fee, String incmg_pers_ipadd, String incmg_pers, String chg_pers, String flag){
		this.cmpy_cd = cmpy_cd;
		this.search_yyyymm = search_yyyymm;
		this.prn = prn;
		this.hlth_insr_fee = hlth_insr_fee;
		this.hlth_insr_med_fee = hlth_insr_med_fee;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
		this.chg_pers = chg_pers;
		this.flag = flag;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSearch_yyyymm(String search_yyyymm){
		this.search_yyyymm = search_yyyymm;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setHlth_insr_fee(String hlth_insr_fee){
		this.hlth_insr_fee = hlth_insr_fee;
	}

	public void setHlth_insr_med_fee(String hlth_insr_med_fee){
		this.hlth_insr_med_fee = hlth_insr_med_fee;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public void setFlag(String flag){
		this.flag = flag;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSearch_yyyymm(){
		return this.search_yyyymm;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getHlth_insr_fee(){
		return this.hlth_insr_fee;
	}

	public String getHlth_insr_med_fee(){
		return this.hlth_insr_med_fee;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getFlag(){
		return this.flag;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_INSR_1301_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_INSR_1301_ADM dm = (HD_INSR_1301_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.registerOutParameter(3, Types.VARCHAR);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.search_yyyymm);
		cstmt.setString(6, dm.prn);
		cstmt.setString(7, dm.hlth_insr_fee);
		cstmt.setString(8, dm.hlth_insr_med_fee);
		cstmt.setString(9, dm.incmg_pers_ipadd);
		cstmt.setString(10, dm.incmg_pers);
		cstmt.setString(11, dm.chg_pers);
		cstmt.setString(12, dm.flag);
	}

	public BaseDataSet createDataSetObject(){
		return new HD_INSR_1301_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("search_yyyymm = [" + getSearch_yyyymm() + "]");
		System.out.println("prn = [" + getPrn() + "]");
		System.out.println("hlth_insr_fee = [" + getHlth_insr_fee() + "]");
		System.out.println("hlth_insr_med_fee = [" + getHlth_insr_med_fee() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("chg_pers = [" + getChg_pers() + "]");
		System.out.println("flag = [" + getFlag() + "]");
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
String search_yyyymm = req.getParameter("search_yyyymm");
if( search_yyyymm == null){
	System.out.println(this.toString+" : search_yyyymm is null" );
}else{
	System.out.println(this.toString+" : search_yyyymm is "+search_yyyymm );
}
String prn = req.getParameter("prn");
if( prn == null){
	System.out.println(this.toString+" : prn is null" );
}else{
	System.out.println(this.toString+" : prn is "+prn );
}
String hlth_insr_fee = req.getParameter("hlth_insr_fee");
if( hlth_insr_fee == null){
	System.out.println(this.toString+" : hlth_insr_fee is null" );
}else{
	System.out.println(this.toString+" : hlth_insr_fee is "+hlth_insr_fee );
}
String hlth_insr_med_fee = req.getParameter("hlth_insr_med_fee");
if( hlth_insr_med_fee == null){
	System.out.println(this.toString+" : hlth_insr_med_fee is null" );
}else{
	System.out.println(this.toString+" : hlth_insr_med_fee is "+hlth_insr_med_fee );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String chg_pers = req.getParameter("chg_pers");
if( chg_pers == null){
	System.out.println(this.toString+" : chg_pers is null" );
}else{
	System.out.println(this.toString+" : chg_pers is "+chg_pers );
}
String flag = req.getParameter("flag");
if( flag == null){
	System.out.println(this.toString+" : flag is null" );
}else{
	System.out.println(this.toString+" : flag is "+flag );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String search_yyyymm = Util.checkString(req.getParameter("search_yyyymm"));
String prn = Util.checkString(req.getParameter("prn"));
String hlth_insr_fee = Util.checkString(req.getParameter("hlth_insr_fee"));
String hlth_insr_med_fee = Util.checkString(req.getParameter("hlth_insr_med_fee"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
String flag = Util.checkString(req.getParameter("flag"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String search_yyyymm = Util.Uni2Ksc(Util.checkString(req.getParameter("search_yyyymm")));
String prn = Util.Uni2Ksc(Util.checkString(req.getParameter("prn")));
String hlth_insr_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("hlth_insr_fee")));
String hlth_insr_med_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("hlth_insr_med_fee")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers")));
String flag = Util.Uni2Ksc(Util.checkString(req.getParameter("flag")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setSearch_yyyymm(search_yyyymm);
dm.setPrn(prn);
dm.setHlth_insr_fee(hlth_insr_fee);
dm.setHlth_insr_med_fee(hlth_insr_med_fee);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
dm.setChg_pers(chg_pers);
dm.setFlag(flag);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Feb 26 14:37:11 KST 2010 */