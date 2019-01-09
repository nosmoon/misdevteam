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


package chosun.ciis.fc.func.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.func.ds.*;
import chosun.ciis.fc.func.rec.*;

/**
 * 
 */


public class FC_FUNC_8063_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String asum_yymm;
	public String tms;

	public FC_FUNC_8063_LDM(){}
	public FC_FUNC_8063_LDM(String cmpy_cd, String asum_yymm, String tms){
		this.cmpy_cd = cmpy_cd;
		this.asum_yymm = asum_yymm;
		this.tms = tms;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAsum_yymm(String asum_yymm){
		this.asum_yymm = asum_yymm;
	}

	public void setTms(String tms){
		this.tms = tms;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAsum_yymm(){
		return this.asum_yymm;
	}

	public String getTms(){
		return this.tms;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_FUNC_8063_L(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_FUNC_8063_LDM dm = (FC_FUNC_8063_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.asum_yymm);
		cstmt.setString(5, dm.tms);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.func.ds.FC_FUNC_8063_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("asum_yymm = [" + getAsum_yymm() + "]");
		System.out.println("tms = [" + getTms() + "]");
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
String asum_yymm = req.getParameter("asum_yymm");
if( asum_yymm == null){
	System.out.println(this.toString+" : asum_yymm is null" );
}else{
	System.out.println(this.toString+" : asum_yymm is "+asum_yymm );
}
String tms = req.getParameter("tms");
if( tms == null){
	System.out.println(this.toString+" : tms is null" );
}else{
	System.out.println(this.toString+" : tms is "+tms );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String asum_yymm = Util.checkString(req.getParameter("asum_yymm"));
String tms = Util.checkString(req.getParameter("tms"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String asum_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("asum_yymm")));
String tms = Util.Uni2Ksc(Util.checkString(req.getParameter("tms")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setAsum_yymm(asum_yymm);
dm.setTms(tms);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Sat Apr 11 13:18:30 KST 2009 */