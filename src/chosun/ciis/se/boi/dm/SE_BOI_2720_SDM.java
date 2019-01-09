/***************************************************************************************************
* ���ϸ� : .java
* ��� : 
* �ۼ����� : 
* �ۼ��� : ������
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.se.boi.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.boi.ds.*;
import chosun.ciis.se.boi.rec.*;

/**
 * 
 */


public class SE_BOI_2720_SDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String yymm;
	public String bocd;
	public String flag;

	public SE_BOI_2720_SDM(){}
	public SE_BOI_2720_SDM(String yymm, String bocd, String flag){
		this.yymm = yymm;
		this.bocd = bocd;
		this.flag = flag;
	}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setFlag(String flag){
		this.flag = flag;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getFlag(){
		return this.flag;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SE_BOI_2720_S(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_BOI_2720_SDM dm = (SE_BOI_2720_SDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.yymm);
		cstmt.setString(4, dm.bocd);
		cstmt.setString(5, dm.flag);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.boi.ds.SE_BOI_2720_SDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("yymm = [" + getYymm() + "]");
		System.out.println("bocd = [" + getBocd() + "]");
		System.out.println("flag = [" + getFlag() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String yymm = req.getParameter("yymm");
if( yymm == null){
	System.out.println(this.toString+" : yymm is null" );
}else{
	System.out.println(this.toString+" : yymm is "+yymm );
}
String bocd = req.getParameter("bocd");
if( bocd == null){
	System.out.println(this.toString+" : bocd is null" );
}else{
	System.out.println(this.toString+" : bocd is "+bocd );
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

String yymm = Util.checkString(req.getParameter("yymm"));
String bocd = Util.checkString(req.getParameter("bocd"));
String flag = Util.checkString(req.getParameter("flag"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("yymm")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String flag = Util.Uni2Ksc(Util.checkString(req.getParameter("flag")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setYymm(yymm);
dm.setBocd(bocd);
dm.setFlag(flag);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Sun Dec 07 18:18:02 KST 2014 */