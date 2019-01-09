	function comm_matr_pop(retFunc, fwdPath){
		model1.setValue("/root/reqData/fwdData/func_nm", retFunc);
		window.load("/xrw/mt/common/MT_COMMON_0000.xrw"
					, "modal"
					, ""
					, "align:center; width:460; height:520; sysmenu:hidden; min:hidden; max:true; resize:true; caption:hidden;"
					,"/root/reqData/fwdData"
					,"/root/reqData/fwdData"
		);
	}
				
	function comm_dlco_pop(retFunc, fwdPath){
		model1.setValue("/root/reqData/fwdData/func_nm", retFunc);
		window.load("/xrw/co/dlco/CO_DLCO_1100.xrw"
					, "modal"
					, ""
					, "align:center; width:660; height:540; sysmenu:hidden; min:hidden; max:true; resize:true; caption:hidden;"
					,"/root/reqData/fwdData"
					,"/root/reqData/fwdData"
		);
	}

	function comm_matrchk_pop(retFunc, fwdPath){
		model1.setValue("/root/reqData/fwdData/func_nm", retFunc);
		window.load("/xrw/mt/commatr/MT_COMMATR_2210.xrw"
					, "modal"
					, ""
					, "align:center; width:400; height:440; sysmenu:hidden; min:hidden; max:true; resize:true; caption:hidden;"
					,"/root/reqData/fwdData"
					,"/root/reqData/fwdData"
		);
	}

	function comm_get_matr(retType){
		var retVal = "";
		if (retType == "nm"){
			retVal = model1.getValue("/root/tempData/gridData/record/matr_nm"); 
		} else if (retType == "uprc"){
			retVal = model1.getValue("/root/tempData/gridData/record/purc_uprc"); 
		} else if (retType == "unit"){
			retVal = model1.getValue("/root/tempData/gridData/record/unit"); 
		}
		return retVal;
	}

	function create_report(fURL, fwdPath){
		var fPath = "/xrw/mt/report/" + fURL;
		window.load(fPath
					, "modal"
					, ""
					, "align:center; width:660; height:540; sysmenu:hidden; min:hidden; max:true; resize:true; caption:hidden;"
					,"/root/reqData/fwdData"
					,"/root/reqData/fwdData"
		);
	}