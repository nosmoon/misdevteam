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


public class AD_BAS_1616_SDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String medi_clsf;
	public String dlco_no;
	public String basi_dt;

	public AD_BAS_1616_SDM(){}
	public AD_BAS_1616_SDM(String cmpy_cd, String medi_clsf, String dlco_no, String basi_dt){
		this.cmpy_cd = cmpy_cd;
		this.medi_clsf = medi_clsf;
		this.dlco_no = dlco_no;
		this.basi_dt = basi_dt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMedi_clsf(String medi_clsf){
		this.medi_clsf = medi_clsf;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setBasi_dt(String basi_dt){
		this.basi_dt = basi_dt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMedi_clsf(){
		return this.medi_clsf;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getBasi_dt(){
		return this.basi_dt;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_BAS_1616_S(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_BAS_1616_SDM dm = (AD_BAS_1616_SDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.medi_clsf);
		cstmt.setString(5, dm.dlco_no);
		cstmt.registerOutParameter(5, Types.VARCHAR);
		cstmt.setString(6, dm.basi_dt);
		cstmt.registerOutParameter(6, Types.VARCHAR);
		cstmt.registerOutParameter(7, Types.VARCHAR);
		cstmt.registerOutParameter(8, Types.VARCHAR);
		cstmt.registerOutParameter(9, Types.VARCHAR);
		cstmt.registerOutParameter(10, Types.VARCHAR);
		cstmt.registerOutParameter(11, Types.VARCHAR);
		cstmt.registerOutParameter(12, Types.VARCHAR);
		cstmt.registerOutParameter(13, Types.VARCHAR);
		cstmt.registerOutParameter(14, Types.VARCHAR);
		cstmt.registerOutParameter(15, Types.VARCHAR);
		cstmt.registerOutParameter(16, Types.VARCHAR);
		cstmt.registerOutParameter(17, Types.VARCHAR);
		cstmt.registerOutParameter(18, Types.VARCHAR);
		cstmt.registerOutParameter(19, Types.VARCHAR);
		cstmt.registerOutParameter(20, Types.VARCHAR);
		cstmt.registerOutParameter(21, Types.VARCHAR);
		cstmt.registerOutParameter(22, Types.VARCHAR);
		cstmt.registerOutParameter(23, Types.VARCHAR);
		cstmt.registerOutParameter(24, Types.VARCHAR);
		cstmt.registerOutParameter(25, Types.VARCHAR);
		cstmt.registerOutParameter(26, Types.VARCHAR);
		cstmt.registerOutParameter(27, Types.VARCHAR);
		cstmt.registerOutParameter(28, Types.VARCHAR);
		cstmt.registerOutParameter(29, Types.VARCHAR);
		cstmt.registerOutParameter(30, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.bas.ds.AD_BAS_1616_SDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("medi_clsf = [" + getMedi_clsf() + "]");
		System.out.println("dlco_no = [" + getDlco_no() + "]");
		System.out.println("basi_dt = [" + getBasi_dt() + "]");
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
String dlco_no = req.getParameter("dlco_no");
if( dlco_no == null){
	System.out.println(this.toString+" : dlco_no is null" );
}else{
	System.out.println(this.toString+" : dlco_no is "+dlco_no );
}
String basi_dt = req.getParameter("basi_dt");
if( basi_dt == null){
	System.out.println(this.toString+" : basi_dt is null" );
}else{
	System.out.println(this.toString+" : basi_dt is "+basi_dt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String medi_clsf = Util.checkString(req.getParameter("medi_clsf"));
String dlco_no = Util.checkString(req.getParameter("dlco_no"));
String basi_dt = Util.checkString(req.getParameter("basi_dt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String medi_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_clsf")));
String dlco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_no")));
String basi_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("basi_dt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setMedi_clsf(medi_clsf);
dm.setDlco_no(dlco_no);
dm.setBasi_dt(basi_dt);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Aug 27 19:11:23 KST 2009 */