/*
   Copyright 2019 langyo<langyo.china@gmail.com> and contributors

  Licensed under the Apache License, Version 2.0 (the "License");
  you may not use this file except in compliance with the License.
  You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS,
  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  See the License for the specific language governing permissions and
  limitations under the License.
 */

package net.mcbbs.client.plugin.minecraft.game;

import java.io.IOException;
import java.nio.file.Path;

/**
 * 游戏的主要路径(?)
 */
public interface IGameRoot {
    /**
     * 获得游戏类型
     * @see Game.Type
     * @return
     */
    Game.Type gameType();

    Path assetsIndex();

    Path libraryIndex();

    Path nativeIndex();

    Path gameJar();

    Path configJson();

    boolean checkLibrary() throws IOException;

    boolean checkAssets() throws IOException;
}
