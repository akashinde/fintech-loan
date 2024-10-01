import { useState } from "react";

export default function LoginRegistration() {
  const [tab, setTab] = useState(1);
  const tabClass = "nav-link";

  return (
    <div class="row justify-content-sm-center">
      <div class="col-sm-auto">
        <div class="card">
          <div class="card-body">
            <div class="container">
              <ul class="nav nav-pills nav-justified mb-3">
                <li class="nav-item">
                  <button
                    className={tabClass + (tab === 1 ? " active" : "")}
                    onClick={() => setTab(1)}
                  >
                    Login
                  </button>
                </li>
                <li
                  class="nav-item"
                  role="presentation"
                  onClick={() => setTab(2)}
                >
                  <button className={tabClass + (tab === 2 ? " active" : "")}>
                    Register
                  </button>
                </li>
              </ul>

              <div className="container">
                {tab === 1 ? <Login /> : tab === 2 ? <Register /> : ""}
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  );
}

function Login() {
  return (
    <form>
      <div data-mdb-input-init class="form-outline mb-4">
        <input type="email" id="loginName" class="form-control" />
        <label class="form-label" for="loginName">
          Email
        </label>
      </div>

      <div data-mdb-input-init class="form-outline mb-4">
        <input type="password" id="loginPassword" class="form-control" />
        <label class="form-label" for="loginPassword">
          Password
        </label>
      </div>

      <div class="row mb-4">
        <div class="col-md-6 d-flex justify-content-center">
          <a href="#!">Forgot password?</a>
        </div>
      </div>

      <button
        type="submit"
        data-mdb-button-init
        data-mdb-ripple-init
        class="btn btn-primary btn-block mb-4"
      >
        Sign in
      </button>
    </form>
  );
}

function Register() {
  return (
    <form>
      <div data-mdb-input-init class="form-outline mb-4">
        <input type="text" id="registerName" class="form-control" />
        <label class="form-label" for="registerName">
          Name
        </label>
      </div>

      <div data-mdb-input-init class="form-outline mb-4">
        <input type="text" id="registerUsername" class="form-control" />
        <label class="form-label" for="registerUsername">
          Username
        </label>
      </div>

      <div data-mdb-input-init class="form-outline mb-4">
        <input type="email" id="registerEmail" class="form-control" />
        <label class="form-label" for="registerEmail">
          Email
        </label>
      </div>

      <div data-mdb-input-init class="form-outline mb-4">
        <input type="password" id="registerPassword" class="form-control" />
        <label class="form-label" for="registerPassword">
          Password
        </label>
      </div>

      <div data-mdb-input-init class="form-outline mb-4">
        <input
          type="password"
          id="registerRepeatPassword"
          class="form-control"
        />
        <label class="form-label" for="registerRepeatPassword">
          Repeat password
        </label>
      </div>

      <div class="form-check d-flex justify-content-center mb-4">
        <input
          class="form-check-input me-2"
          type="checkbox"
          value=""
          id="registerCheck"
          checked
          aria-describedby="registerCheckHelpText"
        />
        <label class="form-check-label" for="registerCheck">
          I have read and agree to the terms
        </label>
      </div>

      <button
        type="submit"
        data-mdb-button-init
        data-mdb-ripple-init
        class="btn btn-primary btn-block mb-3"
      >
        Sign in
      </button>
    </form>
  );
}
