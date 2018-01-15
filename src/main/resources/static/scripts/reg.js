/**
 * Created by zhangchao on 2018/1/15/0015.
 */
var form = $('form');
/*
 * 表单校验
 */
$(document).ready(function () {
    $(form).bootstrapValidator({
        message: 'This value is not valid',
        feedbackIcons: {
            valid: 'glyphicon glyphicon-ok',
            invalid: 'glyphicon glyphicon-remove'
        },
        fields: {
            userName: {
                message: '用户名验证失败',
                validators: {
                    notEmpty: {
                        message: '用户名不能为空'
                    },
                    stringLength: {
                        min: 6,
                        max: 18,
                        message: '用户名长度必须在6到18位之间'
                    },
                    regexp: {
                        regexp: /^[a-zA-Z0-9_]+$/,
                        message: '用户名只能包含大写、小写、数字和下划线'
                    }
                }
            },
            email: {
                validators: {
                    notEmpty: {
                        message: '邮箱不能为空'
                    },
                    emailAddress: {
                        message: '邮箱地址格式有误'
                    }
                }
            },
            password: {
                validators: {
                    notEmpty: {
                        message: '密码不能为空'
                    }
                }
            },
            passwordAgain: {
                validators: {
                    notEmpty: {
                        message: '确认密码不能为空'
                    }
                }
            }
        }
    });
});

/**
 * 注册
 */
$("#submitBtn").click(function () {
    // 进行表单验证
    var bv = form.data('bootstrapValidator');
    bv.validate();
    if (bv.isValid()) {
//            alert(form.serialize());

        // 获值
        var name = $("input[name='userName']").val();
        var email = $("input[name='email']").val();
        var password = $("input[name='password']").val();
        var passwordAgain = $("input[name='passwordAgain']").val();

        // 校验密码
        if (password !== passwordAgain) {
            $("#returnMessage").hide().html('<label class="label label-danger">密码不一致</label>&nbsp;&nbsp;').show(300);
            return;
        }

        // 发送ajax请求
        $.ajax({
            type: 'post',
            url: 'http://localhost:8080/regSub',
            data: {
                name: name,
                email: email,
                password: password
            },
            beforeSend: function (XMLHttpRequest) {
                // 禁用按钮防止重复提交
                $("#submitBtn").attr({disabled: "disabled"});
            },
            success: function (data, status) {
                alert("msg: " + data.msg);
                if (data) {
                    $("#returnMessage").hide().html('<label class="label label-danger">+data.msg+</label>&nbsp;&nbsp;').show(300);
                }
            },
            complete: function (XMLHttpRequest, textStatus) {
                $("#submitBtn").removeAttr("disabled");
            },
            error: function () {
                $("#returnMessage").hide().html('<label class="label label-danger">注册失败</label>&nbsp;&nbsp;').show(300);
            }
        });
    }
});