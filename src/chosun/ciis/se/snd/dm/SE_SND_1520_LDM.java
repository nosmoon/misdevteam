/***************************************************************************************************
* ���ϸ� : SE_SND_1520_LDM.java
* ��� : �Ǹ� - �߼۰��� - ���庰�μ�
* �ۼ����� : 2009.02.03
* �ۼ��� :   �����
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.se.snd.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.snd.ds.*;
import chosun.ciis.se.snd.rec.*;

/**
 * 
 */


public class SE_SND_1520_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd	;
	public String incmg_pers;
	
	public SE_SND_1520_LDM(){}
	public SE_SND_1520_LDM(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}
	
	public String getIncmg_pers() {
		return incmg_pers;
	}
	public void setIncmg_pers(String incmg_pers) {
		this.incmg_pers = incmg_pers;
	}

	public String getSQL(){
		 return "{ call SP_SE_SND_1520_L( ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_SND_1520_LDM dm = (SE_SND_1520_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.incmg_pers);
		cstmt.registerOutParameter(5, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.snd.ds.SE_SND_1520_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd 	= " + getCmpy_cd	());
        System.out.println("incmg_pers 	= " + getIncmg_pers	());
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Feb 23 16:59:08 KST 2009 */