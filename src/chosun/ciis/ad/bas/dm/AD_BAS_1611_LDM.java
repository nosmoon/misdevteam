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


package chosun.ciis.ad.bas.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.bas.ds.*;
import chosun.ciis.ad.bas.rec.*;

/**
 * 
 */


public class AD_BAS_1611_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String medi_clsf;
	public String srch_yymm;
	public String dlco_clsf;

	public AD_BAS_1611_LDM(){}
	public AD_BAS_1611_LDM(String cmpy_cd, String medi_clsf, String srch_yymm, String dlco_clsf){
		this.cmpy_cd = cmpy_cd;
		this.medi_clsf = medi_clsf;
		this.srch_yymm = srch_yymm;
		this.dlco_clsf = dlco_clsf;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMedi_clsf(String medi_clsf){
		this.medi_clsf = medi_clsf;
	}

	public void setSrch_yymm(String srch_yymm){
		this.srch_yymm = srch_yymm;
	}

	public void setDlco_clsf(String dlco_clsf){
		this.dlco_clsf = dlco_clsf;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMedi_clsf(){
		return this.medi_clsf;
	}

	public String getSrch_yymm(){
		return this.srch_yymm;
	}

	public String getDlco_clsf(){
		return this.dlco_clsf;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_BAS_1611_L(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_BAS_1611_LDM dm = (AD_BAS_1611_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.medi_clsf);
		cstmt.setString(5, dm.srch_yymm);
		cstmt.setString(6, dm.dlco_clsf);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.bas.ds.AD_BAS_1611_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("medi_clsf = [" + getMedi_clsf() + "]");
		System.out.println("srch_yymm = [" + getSrch_yymm() + "]");
		System.out.println("dlco_clsf = [" + getDlco_clsf() + "]");
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
String medi_clsf = req.getParameter("medi_clsf");
if( medi_clsf == null){
	System.out.println(this.toString+" : medi_clsf is null" );
}else{
	System.out.println(this.toString+" : medi_clsf is "+medi_clsf );
}
String srch_yymm = req.getParameter("srch_yymm");
if( srch_yymm == null){
	System.out.println(this.toString+" : srch_yymm is null" );
}else{
	System.out.println(this.toString+" : srch_yymm is "+srch_yymm );
}
String dlco_clsf = req.getParameter("dlco_clsf");
if( dlco_clsf == null){
	System.out.println(this.toString+" : dlco_clsf is null" );
}else{
	System.out.println(this.toString+" : dlco_clsf is "+dlco_clsf );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String medi_clsf = Util.checkString(req.getParameter("medi_clsf"));
String srch_yymm = Util.checkString(req.getParameter("srch_yymm"));
String dlco_clsf = Util.checkString(req.getParameter("dlco_clsf"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String medi_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_clsf")));
String srch_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("srch_yymm")));
String dlco_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setMedi_clsf(medi_clsf);
dm.setSrch_yymm(srch_yymm);
dm.setDlco_clsf(dlco_clsf);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Aug 26 14:51:28 KST 2009 */