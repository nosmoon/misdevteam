/***************************************************************************************************
* ���ϸ� : .java
* ��� : ������������ - ��ǥ����
* �ۼ����� : 2010-04-12
* �ۼ��� : �̹�ȿ
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.mt.commatr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.commatr.ds.*;
import chosun.ciis.mt.commatr.rec.*;

/**
 * 
 */


public class MT_COMMATR_5010_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String yymm;
	public String medi_cd;

	public MT_COMMATR_5010_LDM(){}
	public MT_COMMATR_5010_LDM(String cmpy_cd, String yymm, String medi_cd){
		this.cmpy_cd = cmpy_cd;
		this.yymm = yymm;
		this.medi_cd = medi_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getSQL(){
		 return "{ call SP_MT_COMMATR_5010_L( ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_COMMATR_5010_LDM dm = (MT_COMMATR_5010_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.yymm);
		cstmt.setString(5, dm.medi_cd);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.commatr.ds.MT_COMMATR_5010_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("yymm = " + getYymm());
        System.out.println("medi_cd = " + getMedi_cd());
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
String yymm = req.getParameter("yymm");
if( yymm == null){
	System.out.println(this.toString+" : yymm is null" );
}else{
	System.out.println(this.toString+" : yymm is "+yymm );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String yymm = Util.checkString(req.getParameter("yymm"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("yymm")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setYymm(yymm);
dm.setMedi_cd(medi_cd);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Apr 12 14:44:41 KST 2010 */