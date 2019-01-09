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


package chosun.ciis.mc.cost.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mc.cost.ds.*;
import chosun.ciis.mc.cost.rec.*;

/**
 * 
 */


public class MC_COST_2042_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String yymm;
	public String dstb_cd;

	public MC_COST_2042_LDM(){}
	public MC_COST_2042_LDM(String cmpy_cd, String yymm, String dstb_cd){
		this.cmpy_cd = cmpy_cd;
		this.yymm = yymm;
		this.dstb_cd = dstb_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setDstb_cd(String dstb_cd){
		this.dstb_cd = dstb_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getDstb_cd(){
		return this.dstb_cd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_MC_COST_2042_L(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MC_COST_2042_LDM dm = (MC_COST_2042_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.yymm);
		cstmt.setString(5, dm.dstb_cd);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mc.cost.ds.MC_COST_2042_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("yymm = [" + getYymm() + "]");
		System.out.println("dstb_cd = [" + getDstb_cd() + "]");
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
String dstb_cd = req.getParameter("dstb_cd");
if( dstb_cd == null){
	System.out.println(this.toString+" : dstb_cd is null" );
}else{
	System.out.println(this.toString+" : dstb_cd is "+dstb_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String yymm = Util.checkString(req.getParameter("yymm"));
String dstb_cd = Util.checkString(req.getParameter("dstb_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("yymm")));
String dstb_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dstb_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setYymm(yymm);
dm.setDstb_cd(dstb_cd);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue May 12 09:54:07 KST 2009 */