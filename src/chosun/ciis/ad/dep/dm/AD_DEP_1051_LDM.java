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


package chosun.ciis.ad.dep.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.dep.ds.*;
import chosun.ciis.ad.dep.rec.*;

/**
 * 
 */


public class AD_DEP_1051_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String flag;
	public String cmpy_cd;
	public String occr_dt;
	public String slip_clsf;
	public String seq;
	public String pubc_frdt;
	public String pubc_todt;
	public String chnl_clsf;

	public AD_DEP_1051_LDM(){}
	public AD_DEP_1051_LDM(String flag, String cmpy_cd, String occr_dt, String slip_clsf, String seq, String pubc_frdt, String pubc_todt, String chnl_clsf){
		this.flag = flag;
		this.cmpy_cd = cmpy_cd;
		this.occr_dt = occr_dt;
		this.slip_clsf = slip_clsf;
		this.seq = seq;
		this.pubc_frdt = pubc_frdt;
		this.pubc_todt = pubc_todt;
		this.chnl_clsf = chnl_clsf;
	}

	public void setFlag(String flag){
		this.flag = flag;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
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

	public void setPubc_frdt(String pubc_frdt){
		this.pubc_frdt = pubc_frdt;
	}

	public void setPubc_todt(String pubc_todt){
		this.pubc_todt = pubc_todt;
	}

	public void setChnl_clsf(String chnl_clsf){
		this.chnl_clsf = chnl_clsf;
	}

	public String getFlag(){
		return this.flag;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
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

	public String getPubc_frdt(){
		return this.pubc_frdt;
	}

	public String getPubc_todt(){
		return this.pubc_todt;
	}

	public String getChnl_clsf(){
		return this.chnl_clsf;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_DEP_1051_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_DEP_1051_LDM dm = (AD_DEP_1051_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.flag);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.occr_dt);
		cstmt.registerOutParameter(5, Types.VARCHAR);
		cstmt.setString(6, dm.slip_clsf);
		cstmt.registerOutParameter(6, Types.VARCHAR);
		cstmt.setString(7, dm.seq);
		cstmt.registerOutParameter(7, Types.VARCHAR);
		cstmt.setString(8, dm.pubc_frdt);
		cstmt.setString(9, dm.pubc_todt);
		cstmt.setString(10, dm.chnl_clsf);
		cstmt.registerOutParameter(11, Types.VARCHAR);
		cstmt.registerOutParameter(12, Types.VARCHAR);
		cstmt.registerOutParameter(13, Types.VARCHAR);
		cstmt.registerOutParameter(14, Types.VARCHAR);
		cstmt.registerOutParameter(15, Types.INTEGER);
		cstmt.registerOutParameter(16, Types.INTEGER);
		cstmt.registerOutParameter(17, Types.INTEGER);
		cstmt.registerOutParameter(18, Types.INTEGER);
		cstmt.registerOutParameter(19, Types.INTEGER);
		cstmt.registerOutParameter(20, Types.VARCHAR);
		cstmt.registerOutParameter(21, Types.VARCHAR);
		cstmt.registerOutParameter(22, Types.VARCHAR);
		cstmt.registerOutParameter(23, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.dep.ds.AD_DEP_1051_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("flag = [" + getFlag() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("slip_clsf = [" + getSlip_clsf() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("pubc_frdt = [" + getPubc_frdt() + "]");
		System.out.println("pubc_todt = [" + getPubc_todt() + "]");
		System.out.println("chnl_clsf = [" + getChnl_clsf() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String flag = req.getParameter("flag");
if( flag == null){
	System.out.println(this.toString+" : flag is null" );
}else{
	System.out.println(this.toString+" : flag is "+flag );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
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
String pubc_frdt = req.getParameter("pubc_frdt");
if( pubc_frdt == null){
	System.out.println(this.toString+" : pubc_frdt is null" );
}else{
	System.out.println(this.toString+" : pubc_frdt is "+pubc_frdt );
}
String pubc_todt = req.getParameter("pubc_todt");
if( pubc_todt == null){
	System.out.println(this.toString+" : pubc_todt is null" );
}else{
	System.out.println(this.toString+" : pubc_todt is "+pubc_todt );
}
String chnl_clsf = req.getParameter("chnl_clsf");
if( chnl_clsf == null){
	System.out.println(this.toString+" : chnl_clsf is null" );
}else{
	System.out.println(this.toString+" : chnl_clsf is "+chnl_clsf );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String flag = Util.checkString(req.getParameter("flag"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String slip_clsf = Util.checkString(req.getParameter("slip_clsf"));
String seq = Util.checkString(req.getParameter("seq"));
String pubc_frdt = Util.checkString(req.getParameter("pubc_frdt"));
String pubc_todt = Util.checkString(req.getParameter("pubc_todt"));
String chnl_clsf = Util.checkString(req.getParameter("chnl_clsf"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String flag = Util.Uni2Ksc(Util.checkString(req.getParameter("flag")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String slip_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String pubc_frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("pubc_frdt")));
String pubc_todt = Util.Uni2Ksc(Util.checkString(req.getParameter("pubc_todt")));
String chnl_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("chnl_clsf")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setFlag(flag);
dm.setCmpy_cd(cmpy_cd);
dm.setOccr_dt(occr_dt);
dm.setSlip_clsf(slip_clsf);
dm.setSeq(seq);
dm.setPubc_frdt(pubc_frdt);
dm.setPubc_todt(pubc_todt);
dm.setChnl_clsf(chnl_clsf);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Mar 05 18:58:21 KST 2015 */