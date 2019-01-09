/***************************************************************************************************
* ���ϸ� : SE_BNS_1130_LDM.java
* ��� : ���˹����� - ���˹����
* �ۼ����� : 2009-03-16
* �ۼ��� : �̹�ȿ
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.se.bns.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.bns.ds.*;
import chosun.ciis.se.bns.rec.*;

/**
 * 
 */


public class SE_BNS_1130_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String bns_item_cd;

	public SE_BNS_1130_LDM(){}
	public SE_BNS_1130_LDM(String cmpy_cd, String bns_item_cd){
		this.cmpy_cd = cmpy_cd;
		this.bns_item_cd = bns_item_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setBns_item_cd(String bns_item_cd){
		this.bns_item_cd = bns_item_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getBns_item_cd(){
		return this.bns_item_cd;
	}

	public String getSQL(){
		 return "{ call SP_SE_BNS_1130_L( ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_BNS_1130_LDM dm = (SE_BNS_1130_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.bns_item_cd);
		cstmt.registerOutParameter(5, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.bns.ds.SE_BNS_1130_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("bns_item_cd = " + getBns_item_cd());
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
String bns_item_cd = req.getParameter("bns_item_cd");
if( bns_item_cd == null){
	System.out.println(this.toString+" : bns_item_cd is null" );
}else{
	System.out.println(this.toString+" : bns_item_cd is "+bns_item_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String bns_item_cd = Util.checkString(req.getParameter("bns_item_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String bns_item_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("bns_item_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setBns_item_cd(bns_item_cd);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Mar 16 19:08:55 KST 2009 */