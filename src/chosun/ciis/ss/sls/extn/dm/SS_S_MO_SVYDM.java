/***************************************************************************************************
* 파일명 : SS_S_MO_SVYDM.java
* 기능 :  문자점검독자관리 설문 상세를 보여준다.
* 작성일자 : 2015.11.11
* 작성자 : 장선희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 *
 */


public class SS_S_MO_SVYDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String svyid;

	public SS_S_MO_SVYDM(){}
	public SS_S_MO_SVYDM(String svyid){
		this.svyid = svyid;
	}

	public void setSvyid(String svyid){
		this.svyid = svyid;
	}

	public String getSvyid(){
		return this.svyid;
	}

	public String getSQL(){
		 return "{ call SP_SS_S_MO_SVY( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_S_MO_SVYDM dm = (SS_S_MO_SVYDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.svyid);
		cstmt.registerOutParameter(4, Types.VARCHAR);
		cstmt.registerOutParameter(5, Types.VARCHAR);
		cstmt.registerOutParameter(6, Types.VARCHAR);
		cstmt.registerOutParameter(7, Types.VARCHAR);
		cstmt.registerOutParameter(8, Types.INTEGER);
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
		cstmt.registerOutParameter(30, Types.VARCHAR);
		cstmt.registerOutParameter(31, Types.VARCHAR);
		cstmt.registerOutParameter(32, Types.VARCHAR);
		cstmt.registerOutParameter(33, Types.VARCHAR);
		cstmt.registerOutParameter(34, Types.VARCHAR);
		cstmt.registerOutParameter(35, Types.VARCHAR);
		cstmt.registerOutParameter(36, Types.VARCHAR);
		cstmt.registerOutParameter(37, Types.VARCHAR);
		cstmt.registerOutParameter(38, Types.VARCHAR);
		cstmt.registerOutParameter(39, Types.VARCHAR);
		cstmt.registerOutParameter(40, Types.VARCHAR);
		cstmt.registerOutParameter(41, Types.VARCHAR);
		cstmt.registerOutParameter(42, Types.VARCHAR);
		cstmt.registerOutParameter(43, Types.VARCHAR);
		cstmt.registerOutParameter(44, Types.VARCHAR);
		cstmt.registerOutParameter(45, Types.VARCHAR);
		cstmt.registerOutParameter(46, Types.VARCHAR);
		cstmt.registerOutParameter(47, Types.VARCHAR);
		cstmt.registerOutParameter(48, Types.VARCHAR);
		cstmt.registerOutParameter(49, Types.VARCHAR);
		cstmt.registerOutParameter(50, Types.VARCHAR);
		cstmt.registerOutParameter(51, Types.VARCHAR);
		cstmt.registerOutParameter(52, Types.VARCHAR);
		cstmt.registerOutParameter(53, Types.VARCHAR);
		cstmt.registerOutParameter(54, Types.VARCHAR);
		cstmt.registerOutParameter(55, Types.VARCHAR);
		cstmt.registerOutParameter(56, Types.VARCHAR);
		cstmt.registerOutParameter(57, Types.VARCHAR);
		cstmt.registerOutParameter(58, Types.VARCHAR);
		cstmt.registerOutParameter(59, Types.VARCHAR);
		cstmt.registerOutParameter(60, Types.VARCHAR);
		cstmt.registerOutParameter(61, Types.VARCHAR);
		cstmt.registerOutParameter(62, Types.VARCHAR);
		cstmt.registerOutParameter(63, Types.VARCHAR);
		cstmt.registerOutParameter(64, Types.VARCHAR);
		cstmt.registerOutParameter(65, Types.VARCHAR);
		cstmt.registerOutParameter(66, Types.VARCHAR);
		cstmt.registerOutParameter(67, Types.VARCHAR);
		cstmt.registerOutParameter(68, Types.VARCHAR);
		cstmt.registerOutParameter(69, Types.VARCHAR);
		cstmt.registerOutParameter(70, Types.VARCHAR);
		cstmt.registerOutParameter(71, Types.VARCHAR);
		cstmt.registerOutParameter(72, Types.VARCHAR);
		cstmt.registerOutParameter(73, Types.VARCHAR);
		cstmt.registerOutParameter(74, Types.VARCHAR);
		cstmt.registerOutParameter(75, Types.VARCHAR);
		cstmt.registerOutParameter(76, Types.VARCHAR);
		cstmt.registerOutParameter(77, Types.VARCHAR);
		cstmt.registerOutParameter(78, Types.VARCHAR);
		cstmt.registerOutParameter(79, Types.VARCHAR);
		cstmt.registerOutParameter(80, Types.VARCHAR);
		cstmt.registerOutParameter(81, Types.VARCHAR);
		cstmt.registerOutParameter(82, Types.VARCHAR);
		cstmt.registerOutParameter(83, Types.VARCHAR);
		cstmt.registerOutParameter(84, Types.VARCHAR);
		cstmt.registerOutParameter(85, Types.VARCHAR);
		cstmt.registerOutParameter(86, Types.VARCHAR);
		cstmt.registerOutParameter(87, Types.VARCHAR);
		cstmt.registerOutParameter(88, Types.VARCHAR);
		cstmt.registerOutParameter(89, Types.VARCHAR);
		cstmt.registerOutParameter(90, Types.VARCHAR);
		cstmt.registerOutParameter(91, Types.VARCHAR);
		cstmt.registerOutParameter(92, Types.VARCHAR);
		cstmt.registerOutParameter(93, Types.VARCHAR);
		cstmt.registerOutParameter(94, Types.VARCHAR);
		cstmt.registerOutParameter(95, Types.VARCHAR);
		cstmt.registerOutParameter(96, Types.VARCHAR);
		cstmt.registerOutParameter(97, Types.VARCHAR);
		cstmt.registerOutParameter(98, Types.VARCHAR);
		cstmt.registerOutParameter(99, Types.VARCHAR);
		cstmt.registerOutParameter(100, Types.VARCHAR);
		cstmt.registerOutParameter(101, Types.VARCHAR);
		cstmt.registerOutParameter(102, Types.VARCHAR);
		cstmt.registerOutParameter(103, Types.VARCHAR);
		cstmt.registerOutParameter(104, Types.VARCHAR);
		cstmt.registerOutParameter(105, Types.VARCHAR);
		cstmt.registerOutParameter(106, Types.VARCHAR);
		cstmt.registerOutParameter(107, Types.VARCHAR);
		cstmt.registerOutParameter(108, Types.VARCHAR);
		cstmt.registerOutParameter(109, Types.VARCHAR);
		cstmt.registerOutParameter(110, Types.VARCHAR);
		cstmt.registerOutParameter(111, Types.VARCHAR);
		cstmt.registerOutParameter(112, Types.VARCHAR);
		cstmt.registerOutParameter(113, Types.VARCHAR);
		cstmt.registerOutParameter(114, Types.VARCHAR);
		cstmt.registerOutParameter(115, Types.VARCHAR);
		cstmt.registerOutParameter(116, Types.VARCHAR);
		cstmt.registerOutParameter(117, Types.VARCHAR);
		cstmt.registerOutParameter(118, Types.VARCHAR);
		cstmt.registerOutParameter(119, Types.VARCHAR);
		cstmt.registerOutParameter(120, Types.VARCHAR);
		cstmt.registerOutParameter(121, Types.VARCHAR);
		cstmt.registerOutParameter(122, Types.VARCHAR);
		cstmt.registerOutParameter(123, Types.VARCHAR);
		cstmt.registerOutParameter(124, Types.VARCHAR);
		cstmt.registerOutParameter(125, Types.VARCHAR);
		cstmt.registerOutParameter(126, Types.VARCHAR);
		cstmt.registerOutParameter(127, Types.VARCHAR);
		cstmt.registerOutParameter(128, Types.VARCHAR);
		cstmt.registerOutParameter(129, Types.VARCHAR);
		cstmt.registerOutParameter(130, Types.VARCHAR);
		cstmt.registerOutParameter(131, Types.VARCHAR);
		cstmt.registerOutParameter(132, Types.VARCHAR);
		cstmt.registerOutParameter(133, Types.VARCHAR);
		cstmt.registerOutParameter(134, Types.VARCHAR);
		cstmt.registerOutParameter(135, Types.VARCHAR);
		cstmt.registerOutParameter(136, Types.VARCHAR);
		cstmt.registerOutParameter(137, Types.VARCHAR);
		cstmt.registerOutParameter(138, Types.VARCHAR);
		cstmt.registerOutParameter(139, Types.VARCHAR);
		cstmt.registerOutParameter(140, Types.VARCHAR);
		cstmt.registerOutParameter(141, Types.VARCHAR);
		cstmt.registerOutParameter(142, Types.VARCHAR);
		cstmt.registerOutParameter(143, Types.VARCHAR);
		cstmt.registerOutParameter(144, Types.VARCHAR);
		cstmt.registerOutParameter(145, Types.VARCHAR);
		cstmt.registerOutParameter(146, Types.VARCHAR);
		cstmt.registerOutParameter(147, Types.VARCHAR);
		cstmt.registerOutParameter(148, Types.VARCHAR);
		cstmt.registerOutParameter(149, Types.VARCHAR);
		cstmt.registerOutParameter(150, Types.VARCHAR);
		cstmt.registerOutParameter(151, Types.VARCHAR);
		cstmt.registerOutParameter(152, Types.VARCHAR);
		cstmt.registerOutParameter(153, Types.VARCHAR);
		cstmt.registerOutParameter(154, Types.VARCHAR);
		cstmt.registerOutParameter(155, Types.VARCHAR);
		cstmt.registerOutParameter(156, Types.VARCHAR);
		cstmt.registerOutParameter(157, Types.VARCHAR);
		cstmt.registerOutParameter(158, Types.VARCHAR);
		cstmt.registerOutParameter(159, Types.VARCHAR);
		cstmt.registerOutParameter(160, Types.VARCHAR);
		cstmt.registerOutParameter(161, Types.VARCHAR);
		cstmt.registerOutParameter(162, Types.VARCHAR);
		cstmt.registerOutParameter(163, Types.VARCHAR);
		cstmt.registerOutParameter(164, Types.VARCHAR);
		cstmt.registerOutParameter(165, Types.VARCHAR);
		cstmt.registerOutParameter(166, Types.VARCHAR);
		cstmt.registerOutParameter(167, Types.VARCHAR);
		cstmt.registerOutParameter(168, Types.VARCHAR);
		cstmt.registerOutParameter(169, Types.VARCHAR);
		cstmt.registerOutParameter(170, Types.VARCHAR);
		cstmt.registerOutParameter(171, Types.VARCHAR);
		cstmt.registerOutParameter(172, Types.VARCHAR);
		cstmt.registerOutParameter(173, Types.VARCHAR);
		cstmt.registerOutParameter(174, Types.VARCHAR);
		cstmt.registerOutParameter(175, Types.VARCHAR);
		cstmt.registerOutParameter(176, Types.VARCHAR);
		cstmt.registerOutParameter(177, Types.VARCHAR);
		cstmt.registerOutParameter(178, Types.VARCHAR);
		cstmt.registerOutParameter(179, Types.VARCHAR);
		cstmt.registerOutParameter(180, Types.VARCHAR);
		cstmt.registerOutParameter(181, Types.VARCHAR);
		cstmt.registerOutParameter(182, Types.VARCHAR);
		cstmt.registerOutParameter(183, Types.VARCHAR);
		cstmt.registerOutParameter(184, Types.VARCHAR);
		cstmt.registerOutParameter(185, Types.VARCHAR);
		cstmt.registerOutParameter(186, Types.VARCHAR);
		cstmt.registerOutParameter(187, Types.VARCHAR);
		cstmt.registerOutParameter(188, Types.VARCHAR);
		cstmt.registerOutParameter(189, Types.VARCHAR);
		cstmt.registerOutParameter(190, Types.VARCHAR);
		cstmt.registerOutParameter(191, Types.VARCHAR);
		cstmt.registerOutParameter(192, Types.VARCHAR);
		cstmt.registerOutParameter(193, Types.VARCHAR);
		cstmt.registerOutParameter(194, Types.VARCHAR);
		cstmt.registerOutParameter(195, Types.VARCHAR);
		cstmt.registerOutParameter(196, Types.VARCHAR);
		cstmt.registerOutParameter(197, Types.VARCHAR);
		cstmt.registerOutParameter(198, Types.VARCHAR);
		cstmt.registerOutParameter(199, Types.VARCHAR);
		cstmt.registerOutParameter(200, Types.VARCHAR);
		cstmt.registerOutParameter(201, Types.VARCHAR);
		cstmt.registerOutParameter(202, Types.VARCHAR);
		cstmt.registerOutParameter(203, Types.VARCHAR);
		cstmt.registerOutParameter(204, Types.VARCHAR);
		cstmt.registerOutParameter(205, Types.VARCHAR);
		cstmt.registerOutParameter(206, Types.VARCHAR);
		cstmt.registerOutParameter(207, Types.VARCHAR);
		cstmt.registerOutParameter(208, Types.VARCHAR);
		cstmt.registerOutParameter(209, Types.VARCHAR);
		cstmt.registerOutParameter(210, Types.VARCHAR);
		cstmt.registerOutParameter(211, Types.VARCHAR);
		cstmt.registerOutParameter(212, Types.VARCHAR);
		cstmt.registerOutParameter(213, Types.VARCHAR);
		cstmt.registerOutParameter(214, Types.VARCHAR);
		cstmt.registerOutParameter(215, Types.VARCHAR);
		cstmt.registerOutParameter(216, Types.VARCHAR);
		cstmt.registerOutParameter(217, Types.VARCHAR);
		cstmt.registerOutParameter(218, Types.VARCHAR);
		cstmt.registerOutParameter(219, Types.VARCHAR);
		cstmt.registerOutParameter(220, Types.VARCHAR);
		cstmt.registerOutParameter(221, Types.VARCHAR);
		cstmt.registerOutParameter(222, Types.VARCHAR);
		cstmt.registerOutParameter(223, Types.VARCHAR);
		cstmt.registerOutParameter(224, Types.VARCHAR);
		cstmt.registerOutParameter(225, Types.VARCHAR);
		cstmt.registerOutParameter(226, Types.VARCHAR);
		cstmt.registerOutParameter(227, Types.VARCHAR);
		cstmt.registerOutParameter(228, Types.VARCHAR);
		cstmt.registerOutParameter(229, Types.VARCHAR);
		cstmt.registerOutParameter(230, Types.VARCHAR);
		cstmt.registerOutParameter(231, Types.VARCHAR);
		cstmt.registerOutParameter(232, Types.VARCHAR);
		cstmt.registerOutParameter(233, Types.VARCHAR);
		cstmt.registerOutParameter(234, Types.VARCHAR);
		cstmt.registerOutParameter(235, Types.VARCHAR);
		cstmt.registerOutParameter(236, Types.VARCHAR);
		cstmt.registerOutParameter(237, Types.VARCHAR);
		cstmt.registerOutParameter(238, Types.VARCHAR);
		cstmt.registerOutParameter(239, Types.VARCHAR);
		cstmt.registerOutParameter(240, Types.VARCHAR);
		cstmt.registerOutParameter(241, Types.VARCHAR);
		cstmt.registerOutParameter(242, Types.VARCHAR);
		cstmt.registerOutParameter(243, Types.VARCHAR);
		cstmt.registerOutParameter(244, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_S_MO_SVYDataSet();
	}



    public void print(){
        System.out.println("svyid = " + getSvyid());
    }
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String svyid = req.getParameter("svyid");
if( svyid == null){
	System.out.println(this.toString+" : svyid is null" );
}else{
	System.out.println(this.toString+" : svyid is "+svyid );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String svyid = Util.checkString(req.getParameter("svyid"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String svyid = Util.Uni2Ksc(Util.checkString(req.getParameter("svyid")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setSvyid(svyid);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Dec 15 20:59:50 KST 2015 */